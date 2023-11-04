import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3};
        moveZeroToEnd(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZerro(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

    private static void moveZeroToEnd(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
