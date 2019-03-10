class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i,j = 0,1
        while j<len(nums):
            if nums[i]==0 and nums[j]!=0:
                temp = nums[j]
                nums[j] = nums[i]
                nums[i] = temp
                i+=1
                j+=1
            elif nums[i]==0 and nums[j]==0:
                j+=1
            elif nums[i]!=0:
                i+=1
                j+=1
        