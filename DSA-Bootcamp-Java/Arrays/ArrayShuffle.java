package Arrays;

import java.util.Arrays;

//leetcode url: https://leetcode.com/problems/shuffle-the-array/
// level: easy
class SolutionArrayShuffle {

    public static void main(String[] args) {
        int[] input = { 2, 5, 1, 3, 4, 7 };
        System.out.println(Arrays.toString(shuffle2(input, 3)));

    }

    public static int[] shuffle(int[] nums, int n) {
        int[] numsresult = new int[nums.length];
        int index = -1;
        for (int i = 0; i < nums.length / 2; i++) {

            numsresult[++index] = nums[i];
            numsresult[++index] = nums[i + n];
        }
        return numsresult;

    }

    public static int[] shuffle2(int[] nums, int n) {
        int[] res = new int[2 * n];
        for (int i = 0; i < n; i++) {
            res[2 * i] = nums[i];
            res[2 * i + 1] = nums[i + n];
        }
        return res;
    }
}