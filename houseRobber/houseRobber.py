#动态规划题，不可递归（time limit
class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums)==0:return 0
        if len(nums)<2:return max(nums)
        a = 0
        b = 0
        for i in range(0,len(nums)):
            temp = a
            a = max(a,b+nums[i])
            b = temp
        return a

class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums)==0:return 0
        if len(nums)<2:return max(nums)
        maxx = [0 for i in range(0,len(nums)+1)]
        maxx[1] = nums[0]
        for i in range(1,len(nums)):
            maxx[i+1] = max(maxx[i],maxx[i-1]+nums[i])
        return maxx[-1]