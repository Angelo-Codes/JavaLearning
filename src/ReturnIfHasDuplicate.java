import java.util.HashSet;

public class ReturnIfHasDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean result = hasDuplicated(arr);
        System.out.println(result);
    }

    private static boolean hasDuplicated(int[] arr) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i])) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}
