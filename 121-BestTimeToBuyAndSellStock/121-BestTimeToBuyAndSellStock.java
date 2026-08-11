// Last updated: 8/11/2026, 2:17:23 PM
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;          // update minimum price so far
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);  // check profit
            }
        }

        return maxProfit;
    }
}
