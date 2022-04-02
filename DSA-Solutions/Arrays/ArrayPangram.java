package Arrays;
//leetcode url:https://leetcode.com/problems/check-if-the-sentence-is-pangram/

import java.lang.reflect.Array;
import java.util.HashMap;

//level: easy

class SolutionPangram {
    public static void main(String[] args) {
        // String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String sentence = "qklccnqeicrabxpggieplwjhakurwwhxbugbryvhazoofifidzvxczmpdjfcyiuhqyedxhzexvpitxknjogpetvgxeqrjuuxzzfblhmhbgibocbhtcbgyxzchlawvnhczlecsrioapggorouzcputqsxhvoxbqxxydiumxwg";
    }

    public static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        } else {
            char[] sentencechar = sentence.toCharArray();
            HashMap<Integer, Boolean> valueHashMap = new HashMap<>();
            for (int i = 0; i < sentencechar.length; i++) {
                int value = (int) sentencechar[i];
                valueHashMap.put(value, true);
            }
            if (valueHashMap.size() != 26) {
                return false;
            }
        }

        return true;
    }

}