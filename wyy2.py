import sys

def sub(a, b, p, q):
    op = 0
    diff = b - a
    while a < b:
        if p < diff:
            p *= q
            op += 1
        else:
            a += p
            op += 1
    print(op)

T = int(sys.stdin.readline())
for i in range(T):
    arr = sys.stdin.readline().strip(" ")
    a = int(arr[0])
    b = int(arr[1])
    p = int(arr[2])
    q = int(arr[3])
    sub(a, b, p, q)