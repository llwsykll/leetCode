def fun(N, x, h):
    XH = [(xi, hi) for xi, hi in zip(x, h)]
    HX = [(hi, xi) for xi, hi in zip(x, h)]
    sorted_xh = sorted(XH)
    sorted_hx = sorted(HX)
    sorted_a = [yi for  _, yi in sorted_xh]
    sorted_b = [yi for  _, yi in sorted_hx]

    def lis(arr):
        n = len(arr)
        m = [0]*n
        for x in range(n-2, -1, -1):
            for y in range(n-1, x, -1):
                if arr[x] < arr[y] and m[x] <= m[y]:
                    m[x] += 1
            maxv = max(m)
            result = []
            for i in range(n):
                if m[i] == maxv:
                    result.append(arr[i])
                    maxv -= 1
        return result
    len_a = len(lis(sorted_a))
    len_b = len(lis(sorted_b))
    print(max(len_a, len_b))



N = int(input())
x = [0 for x in range(N)]
h = [0 for x in range(N)]
for i in range(N):
	line = input().split(" ")
    x[i] = int(line[0])
    h[i] = int(line[1])
fun(N, x, h)