# 不用数组
class Solution:
    def climbStairs(self, n: 'int') -> 'int':
        if n==1:return 1
        if n==2:return 2
        fi,fii=1,2
        for i in range(2,n):
            fi,fii=fii,fi+fii
        return fii

# 用数组

class Solution:
    def climbStairs(self, n: 'int') -> 'int':
        if n==1:return 1
        if n==2:return 2
        f = [0 for i in range(n)]
        f[0],f[1] = 1,2
        for i in range(2,n):
            f[i] = f[i-1]+f[i-2]
        return f[i]