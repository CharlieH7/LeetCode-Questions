import java.lang.Math;
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        // two pointers approach, left to buy and right to sell
        int left = 0;
        int right = 1;
        while (right < prices.length) {
            if (prices[right] > prices[left]) {
                // calculate profit only if right is greater than left
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(profit, maxProfit);
                right++;
            }
            // if the price on the right is not greater than the price on the left
            else {
                // move both the left and right pointers to the next element
                left = right;
                right++;
            }
        }
        return maxProfit;
    }
}