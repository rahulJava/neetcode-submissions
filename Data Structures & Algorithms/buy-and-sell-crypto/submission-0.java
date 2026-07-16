class Solution {
   public int maxProfit(int[] prices) {
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    // Iterate through each price in the array
    for (int price : prices) {
        // Update the lowest price seen so far
        if (price < minPrice) {
            minPrice = price;
        } 
        // Calculate profit if sold today and update maxProfit if it's higher
        else if (price - minPrice > maxProfit) {
            maxProfit = price - minPrice;
        }
    }
    
    return maxProfit;
}
}
