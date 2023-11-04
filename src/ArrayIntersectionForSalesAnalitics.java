import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ArrayIntersectionForSalesAnalitics {
    public static void main(String[] args) {
        int[] dataset1 = {1, 2, 3, 4, 9};
        int[] dataset2 = {0, 1, 6, 7, 8};
        int[] expectedOutput = commonCustomer(dataset1, dataset2);
        System.out.println(Arrays.toString(expectedOutput));
    }
    public static int[] commonCustomer(int[] dataset1, int[] dataser2) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < dataset1.length; i++) {
            int customerIDs = dataset1[i];
            freqMap.put(customerIDs, freqMap.getOrDefault(customerIDs, 0) + 1);
        }

        ArrayList<Integer> commonCustomer = new ArrayList<>();
        for (int i = 0; i < dataser2.length; i++) {
            int customerIDs = dataser2[i];
            if (freqMap.containsKey(customerIDs) && freqMap.get(customerIDs) > 0) {
                commonCustomer.add(customerIDs);
                freqMap.put(customerIDs, freqMap.get(customerIDs) - 1);
            }
        }

        int[] result = new int[commonCustomer.size()];
        for (int i = 0; i < commonCustomer.size(); i++) {
            result[i] = commonCustomer.get(i);
        }

        return result;

    }
}
