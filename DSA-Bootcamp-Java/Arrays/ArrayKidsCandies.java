package Arrays;

//leetcode url:https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
//level: easy
import java.util.ArrayList;
import java.util.List;

class SolutionKidsCandies {
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        List<Boolean> result = kidsWithCandies(candies, 3);
        for (boolean value : result) {
            System.out.println(value);
        }
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            int totalCandiesForKid = candies[i] + extraCandies;
            if (totalCandiesForKid >= max) {
                max = totalCandiesForKid;
                result.add(true);
            } else {
                result.add(false);
            }

        }
        return result;
    }

}