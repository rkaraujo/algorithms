package software.renato.algo;

/*
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        if (digits.length == 0) {
            return new int[0];
        }

        int[] result = new int[digits.length];

        boolean carry = true;
        for (int i = digits.length - 1; i >= 0; i--) {
            int digit = digits[i];
            if (carry) {
                digit = digit + 1;
                if (digit == 10) {
                    digit = 0;
                } else {
                    carry = false;
                }
            }
            result[i] = digit;
        }

        if (carry) {
            int[] biggerResult = new int[digits.length + 1];
            System.arraycopy(result, 0, biggerResult, 1, digits.length);
            biggerResult[0] = 1;
            return biggerResult;
        }

        return result;
    }

}
