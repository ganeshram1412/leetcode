package Arrays;
//leetcode url: https://leetcode.com/problems/build-array-from-permutation/

//level: easy

import java.util.Arrays;
import java.util.logging.Logger;

class Solution {
    private static final Logger log = Logger.getLogger(Solution.class.getName());

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 0 };
        int[] result = buildArray(numbers);
        log.info(Arrays.toString(result));

    }

    public static int[] buildArray(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            int value = nums[i];
            result[i] = nums[value];
        }
        return result;
    }

}