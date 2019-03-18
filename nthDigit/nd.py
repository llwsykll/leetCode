class Solution:
    def findNthDigit(self, n: int) -> int:
        nth , nrange = 1,9
        if n<=9:
            return n
        while n - nth*nrange>=0:
            n -= nth*nrange
            nth += 1
            nrange *= 10
        numb = 10**(nth-1) + (n//nth if n%nth else n//nth-1)
        print(numb)
        return int(str(numb)[n%nth-1])