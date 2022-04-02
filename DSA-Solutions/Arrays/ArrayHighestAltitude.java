//leetcode easy
//leetcode url https://leetcode.com/problems/find-the-highest-altitude/
package Arrays;

class ArrayHighestAltitude {
    public static void main(String[] args) {
        int[] gain = { -5, 1, 5, 0, -7 };
        System.out.println(largestAltitude(gain));

    }

    public static int largestAltitude(int[] gain) {
        int[] temp = new int[gain.length + 1];
        temp[0] = 0;
        int counter = 1;
        int highest = 0;
        for (int i = 0; i < gain.length; i++) {
            int diff = temp[i] + gain[i];
            temp[counter++] = diff;
            if (diff > highest) {
                highest = diff;
            }
        }
        if (temp[0] > highest) {
            highest = temp[0];
        }
        return highest;
    }
}
