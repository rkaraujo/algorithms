package software.renato.algo.cw;

/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).

Examples
toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"

toCamelCase("The_Stealth_Warrior"); // returns "TheStealthWarrior"
 */
public class ConvertToCamelCase {

    static String toCamelCase(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isUppercase = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '_' || c == '-') {
                isUppercase = true;
                continue;
            }

            boolean isFirst = sb.length() == 0;
            if (isFirst) {
                sb.append(c);
            } else if (isUppercase) {
                sb.append(Character.toUpperCase(c));
                isUppercase = false;
            } else {
                sb.append((Character.toLowerCase(c)));
            }
        }

        return sb.toString();
    }

}
