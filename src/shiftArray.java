import java.util.Arrays;

public class shiftArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = 2;

        int[] shiftedArr = shiftarray(arr, n);
        System.out.println(Arrays.toString(shiftedArr));
    }

    private static int[] shiftarray(int[] arr, int n) {
        int len = arr.length;
        int[] shifted = new int[len];

        for (int i = 0; i < len; i++) {
            shifted[(i + n) % len] = arr[i];
        }
        return shifted;
    }
}
