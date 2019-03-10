# The isBadVersion API is already defined for you.
# @param version, an integer
# @return a bool
# def isBadVersion(version):

class Solution:
    def firstBadVersion(self, n):
        """
        :type n: int
        :rtype: int
        """
        left = 0
        right = n-1
        while left<=right:
            mid = left +(right-left)//2
            if isBadVersion(mid) == False:
                left = mid+1
            else:
                right = mid-1
        return left
        