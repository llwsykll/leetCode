class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        nums.sort(reverse = True)
        j = 1
        res = nums[0]
        for i in range(1,len(nums)):
            if nums[i]!=nums[i-1]:
                res = nums[i]
                j+=1
            if j ==3:return res
        return nums[0]
            