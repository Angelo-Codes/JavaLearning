import java.util.Arrays;

public class ReverseInput {
    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        reverseArr(arr);
        System.out.println(arr);
    }

    private static void reverseArr(char[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
