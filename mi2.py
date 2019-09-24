def find(A):
    m = len(A[0])
    for i in range(len(A)):
        j = 0
        while j<= (m-2):
            if A[i][j]==A[i][j+1]:
                A[i][j]*=2
                A[i][j+1]=0
                j+=2
            else:
                j+=1
        T=[]
        for j in range(len(A[0])):
            if A[i][j]!=0:
                T.append(A[i][j])
                A[i][j]=0
        for k in range(len(T)):
            A[i][k]=T[k]
    return A


n = int(input())
grid = []
for i in range(n):
    l = list(map(int,input().split()))
    grid.append(l)

B=find(grid)
for b in B:
    print(" ".join(list(map(str, b))))

# n = int(input())
# l = []
# for i in range(n):
#     l.append(int(input()))
# tmp = l
# tmp.sort()

