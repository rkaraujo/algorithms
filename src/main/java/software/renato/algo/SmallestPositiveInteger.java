package software.renato.algo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
public class SmallestPositiveInteger {
    public int solution(int[] A) {
        Set<Integer> positiveSet = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            positiveSet.add(A[i]);
        }

        int i;
        for (i = 1; i <= positiveSet.size(); i++) {
            if (!positiveSet.contains(i)) {
                return i;
            }
        }
        return i;
    }
}
