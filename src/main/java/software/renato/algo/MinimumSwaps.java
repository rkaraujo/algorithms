package software.renato.algo;

import java.util.Arrays;

/*
You are given an unordered array consisting of consecutive integers [1, 2, 3, ..., n] without any duplicates.
You are allowed to swap any two elements. You need to find the minimum number of swaps required to sort the array in ascending order.
 */
public class MinimumSwaps {

    public int solution(int[] arr) {
        int[] orderedArr = arr.clone();
        Arrays.sort(orderedArr);

        boolean[] valueVisited = new boolean[arr.length+1];

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!valueVisited[orderedArr[i]]) {
                valueVisited[orderedArr[i]] = true;

                int value = arr[i];
                if (value != orderedArr[i]) {
                    while (!valueVisited[value]) {
                        valueVisited[value] = true;
                        value = arr[value-1];
                        count++;
                    }
                }
            }
        }

        return count;
    }


}
