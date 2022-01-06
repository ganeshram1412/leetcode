package Arrays;

//leetcode easy
//leetcode url https://leetcode.com/problems/flipping-an-image/
class FlippingImage {
    public static void main(String[] args) {
        int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 1 } };
        flipAndInvertImage(image);
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] result = new int[image.length][image.length];
        for (int i = image.length - 1; i >= 0; i--) {
            int index1 = 0;
            int index2 = 0;

            for (int j = image[i].length - 1; j >= 0; j--) {

                if (image[i][j] == 0) {
                    result[index1][index2] = 1;

                } else {
                    result[index1][index2] = 0;

                }
                ++index2;
            }
            ++index1;
        }
        return result;
    }
}