def fun(N, arr):
    if not arr:
        print(0)
    if len(arr) < 2:
        print(arr[0])
    dp = [0 for x in range(N)]
    dp[0] = arr[0]
    dp[1] = max(arr[0], arr[1])
    select1 = [0 for x in range(N)]
    select2 = [0 for x in range(N)]
    select1[0] = 1
    select2[1] = 1
    res = []
    for i in range(2, N):
        if dp[i-2] + arr[i] > dp[i-1]:
            dp[i] = dp[i-2] + arr[i]
            select1[i] = 1
            res = select1
        else:
            dp = dp[i-1]
            select2[i] = 0
            res = select2
        dp[i] = max(dp[i-2] + arr[i], dp[i-1])
    print(int(max(dp)) + " " + int(sum(res)))


N = int(input())
arr = [-1 for i in range(N)]
line = input().split(" ")
for i in range(N):
    arr[i] = int(line[i])
fun(N, arr)