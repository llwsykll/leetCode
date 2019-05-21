class Solution:
    def canJump(self, nums: List[int]) -> bool:
        maxl = 0
        for i, n in enumerate(nums):
            if i > maxl:
                return False
            maxl = max(maxl, i+n)
        return True