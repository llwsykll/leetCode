w = [2,3,4,5]
v = [3,4,5,6]

bagV = 8
dp = [[0 for x in range(bagV+1)] for y in range(5)]
for i in range(1, 5):
    for j in range(1, bagV + 1):
        if j < w[i-1]:
            dp[i][j] = dp[i-1][j]
        else:
            dp[i][j] = max(dp[i - 1][j], dp[i - 1][j - w[i-1]] + v[i-1])

print(max(dp[4]))
