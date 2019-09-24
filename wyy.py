import sys

def sub(x):
    sum = 0
    if x <= 9:
        print(x)
    else:
        while x > 0:
            x -= 9
            if x > 0:
                sum = sum * 10 + 9
            else:
                sum = 10**len(str(sum)) * (x + 9) + sum
        print(sum)

T = int(sys.stdin.readline())
for i in range(T):
    sub(int(sys.stdin.readline()))