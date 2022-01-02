package Arrays;

class ArrayGoodPairs {
    public static void main(String[] args) {
        int[] input = { 1, 2, 3 };
        System.out.println(numIdenticalPairs(input));
    }

    public static int numIdenticalPairs(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    counter++;
                }
            }
        }
        return counter;
    }
}