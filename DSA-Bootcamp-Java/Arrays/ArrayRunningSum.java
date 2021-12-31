//leetcode url: https://leetcode.com/problems/running-sum-of-1d-array/

//level: easy
package Arrays;

import java.util.Arrays;
import java.util.logging.Logger;

class ArrayRunningSum {
    private static final Logger log = Logger.getLogger(ArrayRunningSum.class.getName());

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        log.info(Arrays.toString(runningSum(nums)));

    }

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];

        }
        return nums;
    }
}