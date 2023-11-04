import java.util.Arrays;

 public class Rotate2DMatrixFlipImage {
    public static void main(String[] args) {
        int[][] image = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int[][] result = rotateImage(image);
        System.out.println(Arrays.deepToString(result));
    }

    private static int[][] rotateImage(int[][] image) {
        int n = image.length;
        int[][] rotateImage = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotateImage[i][j] = image[n - 1 - i][n - 1 - j];
            }
        }
        return rotateImage;
    }
}
