package Arrays;

class DigitCounts {
    public static void main(String[] args) {
        int[] nums = { 555, 901, 482, 1771 };
        findNumbers(nums);
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (Integer.toString(nums[i]).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}