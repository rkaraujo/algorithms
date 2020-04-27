package software.renato.algo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    // Last Stone Weight
    public int lastStoneWeight(int[] stones) {

        while (stones.length > 1) {
            Arrays.sort(stones);

            int stone1 = stones[stones.length - 1];
            int stone2 = stones[stones.length - 2];

            int result = Math.abs(stone1 - stone2);
            if (result == 0) {
                stones = Arrays.copyOf(stones, stones.length - 2);
            } else {
                stones = Arrays.copyOf(stones, stones.length - 1);
                stones[stones.length - 1] = result;
            }
        }

        return stones.length == 0 ? 0 : stones[0];
    }

    // Contiguous Array
    public int findMaxLength(int[] nums) {
        int maxLength = 0;

        Map<Integer, Integer> mapSumToIndex = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] == 0 ? -1 : 1;

            if (sum == 0) {
                maxLength = i + 1;
            }

            if (!mapSumToIndex.containsKey(sum)) {
                mapSumToIndex.put(sum, i);
            } else {
                maxLength = Math.max(maxLength, i - mapSumToIndex.get(sum));
            }
        }


        return maxLength;
    }

    // Perform String Shifts
    public String stringShift(String s, int[][] shift) {
        int finalShift = calculateFinalShift(shift);

        if (Math.abs(finalShift) > s.length()) {
            finalShift = finalShift % s.length();
        }

        char[] strArr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int index = i + finalShift;
            if (index >= s.length()) {
                index = index % s.length();
            } else if (index < 0) {
                index = s.length() + index;
            }

            strArr[index] = s.charAt(i);
        }

        return String.valueOf(strArr);
    }

    private int calculateFinalShift(int[][] shift) {
        int finalShift = 0;
        for (int i = 0; i < shift.length; i++) {
            if (shift[i][0] == 0) {
                finalShift -= shift[i][1];
            } else {
                finalShift += shift[i][1];
            }
        }
        return finalShift;
    }

    // Valid Parenthesis String
    public boolean checkValidString(String s) {
        if (s == null || s.equals("")) {
            return true;
        }

        int maxOpen = 0;
        int minOpen = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                minOpen++;
                maxOpen++;
            }
            else if (s.charAt(i) == ')') {
                if (minOpen - 1 < 0 && maxOpen -1 < 0) {
                    return false;
                }
                if (minOpen > 0) {
                    minOpen--;
                }
                maxOpen--;
            }
            else if (s.charAt(i) == '*') {
                if (minOpen > 0) {
                    minOpen--;
                }
                maxOpen++;
            }
        }

        return minOpen == 0;
    }

    // Subarray Sum Equals K
    public int subarraySum(int[] nums, int k) {
        int count = 0;

        int sum = 0;
        Map<Integer, Integer> mapSums = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k) {
                count++;
            }

            if (mapSums.containsKey(sum - k)) {
                count += mapSums.get(sum - k);
            }

            if (mapSums.containsKey(sum)) {
                int mapCount = mapSums.get(sum);
                mapSums.put(sum, mapCount+1);
            } else {
                mapSums.put(sum, 1);
            }
        }

        return count;
    }

    // Bitwise AND of Numbers Range
    public int rangeBitwiseAnd(int m, int n) {
        if (m == 0) {
            return 0;
        }

        int result = Integer.MAX_VALUE;
        for (int i = m; i > 0 && i <= n; i++) {
            result &= i;
            if (result == 0) {
                return 0;
            }
        }

        return result;
    }

}
