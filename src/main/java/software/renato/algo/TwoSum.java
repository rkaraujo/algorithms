package software.renato.algo;

import java.util.*;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapNumIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mapNumIndex.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int remaining = target - num;
            Integer indexRemaining = mapNumIndex.get(remaining);
            if (indexRemaining != null && indexRemaining != i) {
                return new int[] {i, indexRemaining};
            }
        }

        return new int[] {};
    }
}
