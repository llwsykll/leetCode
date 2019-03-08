class Solution:
    def addDigits(self, num: int) -> int:
        if num>pow(2,31)-1:return -1
        s = str(num)
        sum = 0
        for n in s:
            sum+= int(n)
        if len(str(sum)) > 1: sum = self.addDigits(sum)
        if len(str(sum)) == 1: return sum

class Solution:
    def addDigits(self, num: int) -> int:
        if num>pow(2,31)-1: return -1
        while num>9:
            num = sum(int(n) for n in str(num))
        return num

class Solution:
    def addDigits(self, num: int) -> int:
        if num == 0: return 0
        return num%9 if num%9!=0 else 9