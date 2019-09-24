import sys

prices = [50, 1]
budget = 101
prices = sorted(prices)

n = 0
for price in prices:
    if price > budget:
        break
    n += 1

dp = [sys.maxsize for i in range(budget + 1)]
for i in range(0, n):
    dp[prices[i]] = 1

for i in range(1, budget +1):
    if dp[i] == sys.maxsize:
        for price in prices:
            if i - price > 0:
                dp[i] = min(dp[i], dp[i - price] + 1)

print(dp[budget] if dp[budget] != sys.maxsize else -1)
