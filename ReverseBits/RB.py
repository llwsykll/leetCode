class Solution:
    # @param n, an integer
    # @return an integer
    def reverseBits(self, n):
        s = '{0:032b}'.format(n)
        return int(s[::-1],2)

class Solution:
    # @param n, an integer
    # @return an integer
    def reverseBits(self, n):
        res = 0
        for i in range(0,32):
            if n & 1==1:
                res<<=1
                res+=1
            if n & 1 ==0:
                res<<=1
            n>>=1
        return res