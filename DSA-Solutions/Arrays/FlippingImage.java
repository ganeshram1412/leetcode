package Arrays;

import java.util.Arrays;

//leetcode easy
//leetcode url https://leetcode.com/problems/flipping-an-image/
class FlippingImage {
    public static void main(String[] args) {
        int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        int[][] result = flipAndInvertImage(image);
        for (int i = 0; i < result.length; i++) {

            for (int j = result[i].length - 1; j >= 0; j--) {
                System.out.println("result is " + result[i][j]);
            }
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {

            for (int j = image[i].length - 1; j >= 0; j--) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
}