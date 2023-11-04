import java.util.Arrays;

public class DecrementLargeIntegers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] result = decrementLargeInteger(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] decrementLargeInteger(int[] arr) {
        int n = arr.length;
        int i = n - 1;
        while (i >= 0 && arr[i] == 0) {
            arr[i] = 9;
            i--;
        }
        if (i >= 0) {
            arr[i]--;
        } else {
            arr = new int[n];
            arr[0] = 0;
        }
        return arr;
    }
}
