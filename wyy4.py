import sys

def sub(arr):
    max_len = 0
    sum = 0
    dp = [-sys.maxsize]
    for i in arr:
        sum += i
        dp.append(sum)
    length = 0
    for index, i in enumerate(arr):
        if i >= dp[index]:
            length += 1
            max_len = max(length, max_len)
        else:
            this = dp[index]
            for j in range(index, len(dp) - 1):
                dp[j] = dp[j] - this
            length = 1
    print(max_len)

T = int(sys.stdin.readline())
for i in range(T):
    n = int(sys.stdin.readline())
    line = sys.stdin.readline().strip()
    arr = map(int, line.split())
    sub(arr)
# sub([4,2,9,16,7])