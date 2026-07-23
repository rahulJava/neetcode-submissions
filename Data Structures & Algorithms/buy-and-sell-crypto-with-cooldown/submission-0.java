class Solution {
    public int maxProfit(int[] prices) {
           int holding = Integer.MIN_VALUE;
        int sold = 0;
        int rest = 0;

        for (int price : prices) {
            int prevSold = sold;
            
            // Can sell only if we were holding
            sold = holding + price;
            
            // Can hold if we were already holding OR we buy today (must have been resting)
            holding = Math.max(holding, rest - price);
            
            // Can rest if we were already resting OR we just finished cooldown (sold yesterday)
            rest = Math.max(rest, prevSold);
        }
        
        // The max profit will be either in the sold or rest state
        return Math.max(sold, rest);
    }
}
