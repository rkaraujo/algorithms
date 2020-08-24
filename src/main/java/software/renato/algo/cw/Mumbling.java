package software.renato.algo.cw;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
This time no story, no theory. The examples below show you how to write function accum:

Examples:

accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"

The parameter of accum is a string which includes only letters from a..z and A..Z.
 */
public class Mumbling {

    public static String accum(String s) {
        return IntStream.range(0, s.length())
                .mapToObj(i -> createMumbling(i + 1, String.valueOf(s.charAt(i))))
                .collect(Collectors.joining("-"));
    }

    private static String createMumbling(int position, String letter) {
        StringBuilder sb = new StringBuilder();
        sb.append(letter.toUpperCase());
        for (int i = 1; i < position; i++) {
            sb.append(letter.toLowerCase());
        }
        return sb.toString();
    }
}
