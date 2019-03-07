class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        if n<=0: return False
        s = str(bin(n))
        return s.count('1')==1