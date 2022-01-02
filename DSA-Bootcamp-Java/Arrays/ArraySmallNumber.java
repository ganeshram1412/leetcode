package Arrays;

import java.util.Arrays;

//leetcode url https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
//level: easy

class ArraySmallNumber {
    public static void main(String[] args) {
        int[] nums = { 7, 7, 7, 7 };
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int index = -1;
        int length = nums.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            int count = 0;
            for (int j = 0; j < length; j++) {
                if (j != i && nums[j] < nums[i]) {
                    count++;
                }
            }
            result[++index] = count;
        }
        return result;
    }
}