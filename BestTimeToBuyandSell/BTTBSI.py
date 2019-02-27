class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profits = [0 for i in range(0,len(prices))]
        for i in range(0,len(prices)-1):
            profits[i] = max(prices[i:]) - prices[i] 
        return 0 if len(prices)<=1 else max(profits)

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minp,maxp = float('inf'),0
        for price in prices:
            minp = min(price,minp)
            profit = price-minp
            maxp = max(profit,maxp)
        return maxp
    