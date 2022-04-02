// leetcode level easy
//leetcode url https://leetcode.com/problems/count-items-matching-a-rule/
package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CountMatchingRuleList {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        List<String> value1 = Arrays.asList("phone", "blue", "pixel");

        items.add(value1);

        System.out.println(countMatches(items, "color", "blue"));

    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int result = 0;
        for (List<String> list : items) {
            int counter = 0;
            for (String item : list) {
                ++counter;
                if (counter == 1 && ruleKey.equals("type") && ruleValue.equals(item)) {
                    result++;
                }
                if (counter == 2 && ruleKey.equals("color") && ruleValue.equals(item)) {
                    result++;
                }
                if (counter == 3 && ruleKey.equals("name") && ruleValue.equals(item)) {
                    result++;
                }

            }
        }
        return result;
    }

}