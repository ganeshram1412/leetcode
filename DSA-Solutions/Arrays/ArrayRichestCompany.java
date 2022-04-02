//url https://leetcode.com/problems/richest-customer-wealth/
//level: easy
package Arrays;

import java.util.Arrays;
import java.util.logging.Logger;

class SolutionRichestCompany {
    private static final Logger log = Logger.getLogger(SolutionRichestCompany.class.getName());

    public static void main(String[] args) {
        int[][] customerDetails = { { 1, 2, 3 }, { 3, 2, 1 } };

        log.info("Result is " + maximumWealth(customerDetails));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int temp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp = temp + accounts[i][j];

            }
            if (temp > max) {
                max = temp;
            }

        }

        return max;
    }
}