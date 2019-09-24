import sys

def sub(n, arr):
    dic = {}
    sum = 0
    for i in range(n):
        dic[arr[i]] = i
        for key, value in dic.items:
            if key > arr[i]:
                sum += i - value
    print(sum)

n = int(sys.stdin.readline())
line = sys.stdin.readline().strip()
arr = map(int, line.split()) 
sub(n, arr)