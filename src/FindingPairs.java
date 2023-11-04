import java.util.Arrays;
import java.util.HashMap;

public class FindingPairs {
    public static void main(String[] args) {
        int[] prices = {10, 20, 30, 40, 50};
        int target = 60;
        int[] ouput = findProductIndices(prices, target);
        int[] expectedOutput = {0, 4};
        System.out.println("expected : " + Arrays.toString(expectedOutput) + "\n" + "output : " + Arrays.toString(ouput));
    }

    private static int[] findProductIndices(int[] prices, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < prices.length; i++) {
            int complement = target - prices[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(prices[i], i);
        }
        return new int[]{-1, -1};
    }
}
