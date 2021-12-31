package Arrays;

import java.util.Arrays;
import java.util.logging.Logger;

// leetcode url: https://leetcode.com/problems/concatenation-of-array

// level: easy

class SolutionArrayConcatenation {
    private static final Logger log = Logger.getLogger(SolutionArrayConcatenation.class.getName());

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        log.info(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] result = new int[length * 2];
        for (int i = 0; i < length; i++) {
            result[i] = nums[i];
            result[i + length] = nums[i];
        }
        return result;
    }
}