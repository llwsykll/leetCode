class Solution:
    def isHappy(self, n: int) -> bool:
        if n==0:return False
        sum = n
        while sum!=4 or sum!=1:
            s = str(sum)
            sum = 0
            for i in range(0,len(s)):
                sum += int(s[i])**2
            if sum == 1:return True
            if sum == 4:return False

class Solution:
    def isHappy(self, n: int) -> bool:
        if n==0:return False
        sum = 0
        s = str(n)
        for i in range(0,len(s)):
            sum += int(s[i])**2
        if sum == 1:return True
        if sum == 4:return False
        return self.isHappy(sum)