package software.renato.algo.cw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/*
Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

Examples
"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
""  -->  ""
 */
public class YourOrderPlease {

    public static String order(String words) {
        if (words == null) {
            return "";
        }

        String[] wordsSplit = words.split(" ");

        return Arrays.stream(wordsSplit)
                .map(YourOrderPlease::buildWordAndPosition)
                .filter((wp) -> wp.position >= 0)
                .sorted(Comparator.comparingInt(WordAndPosition::getPosition))
                .map(WordAndPosition::getWord)
                .collect(Collectors.joining(" "));
    }

    private static WordAndPosition buildWordAndPosition(String word) {
        int position = findPosition(word);
        return new WordAndPosition(word, position);
    }

    private static int findPosition(String word) {
        // ASCII 0 -> 48 / 9 -> 57
        StringBuilder sbPosition = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (letter - '0' >= 0 && letter - '0' <= 9) {
                sbPosition.append(letter);
                continue;
            }

            // started reading a number and now is not a number anymore
            if (sbPosition.length() > 0) {
                break;
            }
        }

        return sbPosition.length() == 0 ? -1 : Integer.parseInt(sbPosition.toString());
    }

    private static class WordAndPosition {
        private final String word;
        private final int position;

        public WordAndPosition(String word, int position) {
            this.word = word;
            this.position = position;
        }

        public int getPosition() {
            return position;
        }

        public String getWord() {
            return word;
        }
    }

}
