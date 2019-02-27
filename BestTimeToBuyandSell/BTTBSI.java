class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int maxp = 0;
        int minp = prices[0];
        for(int price : prices){
            minp = Math.min(price,minp);
            int curr = price - minp;
            maxp = Math.max(curr,maxp);
        }
        return maxp;
    }
}