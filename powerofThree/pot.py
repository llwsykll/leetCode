class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        if n<1:return False
        a = math.log(n,3)
        return abs(round(a) - a) < 0.0000000000001