class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        nums.sort()
        if nums[-1]!= len(nums): return len(nums)
        if nums[0]!=0:return 0
        for i in range(0,len(nums)):
            if nums[i]!= i:return i
        return -1