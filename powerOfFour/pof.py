class Solution:
    def isPowerOfFour(self, num: int) -> bool:
        if num<1: return False
        a = math.log(num,4)
        return abs(round(a)-a)<0.0000000000001