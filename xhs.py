def fun(arr, N):
    if not arr:
        print(0)
    k = 0
    have = set()
    for i in range(N):
        if i not in have:
            q = [i]
            while q:
                p = q.pop(0)
                if p not in have:
                    have.add(p)
                    q += [a for a, v in enumerate(arr[p]) if v and (a not in have)]
            k += 1
    print(k)

N = 3
arr = [[1,1,0],[1,1,0],[0,0,1]]
for i in range(N):
    arr[i] = input().split(" ")
