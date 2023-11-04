public class MaxProfit {
    public static void main(String[] args) {
        int[] price = {7, 1, 5, 3, 6, 4};
        int expectedOutput = 5;
        int actualOutput = maxProfit(price);
        System.out.println("expectedOutput : " + expectedOutput + "\n" +
                "actualOutput : " + actualOutput);
    }

    private static int maxProfit(int[] price) {

        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        System.out.println(minPrice);

        for (int i = 0; i < price.length; i++) {
            if (price[i] < minPrice) {
                minPrice = price[i];
            } else if (price[i] - minPrice > maxProfit) {
                maxProfit = price[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
