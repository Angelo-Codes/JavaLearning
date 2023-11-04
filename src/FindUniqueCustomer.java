import java.util.HashMap;

public class FindUniqueCustomer {
    public static void main(String[] args) {
        int[] customerIDs = {1, 2, 3, 4, 5, 1, 2, 3, 4};
        int uniqueCustomerId = findUniqueCustomerId(customerIDs);
        System.out.println(uniqueCustomerId);
    }

    private static int findUniqueCustomerId(int[] customerIDs) {

        if (customerIDs == null || customerIDs.length == 0) {
            return -1;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int id : customerIDs) {
            if (map.containsKey(id)) {
                map.put(id, map.get(id) + 1);
            } else {
                map.put(id, 1);
            }
        }

        for (int id : customerIDs) {
            if (map.get(id) == 1) {
                return id;
            }
        }
        return -1;
    }
}
