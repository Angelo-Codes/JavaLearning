import java.util.Arrays;

public class RemoveDuplicateEntries {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 2};

        int[] ha = removeDuplicateNums(nums);
        System.out.println("Actual Output : " + Arrays.toString(ha));
    }

    private static int[] removeDuplicateNums(int[] nums) {
        if (nums == null || nums.length == 0) {
            System.out.println("pleas enter array type");
        }
        int[] newarray = new int[nums.length - 1];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    newarray[index] = nums[i];
                    index++;
                }
            }
        }
        return newarray;
    }

}
