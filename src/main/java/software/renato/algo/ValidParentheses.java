package software.renato.algo;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        if (s == null || s.equals("")) {
            return true;
        }

        Deque<Character> openParentheses = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // open parentheses goes to stack
            if ( currentChar == '(' || currentChar == '{' || currentChar == '[') {
                openParentheses.addFirst(currentChar);
                continue;
            }

            // if it's a closing character, but there is no open parentheses
            if (openParentheses.isEmpty()) {
                return false;
            }

            char currentOpened = openParentheses.removeFirst();
            if (currentOpened == '(' && currentChar != ')') {
                return false;
            }
            if (currentOpened == '{' && currentChar != '}') {
                return false;
            }
            if (currentOpened == '[' && currentChar != ']') {
                return false;
            }
        }

        // if all open characters are closed, it is valid
        return openParentheses.isEmpty();
    }

}
