class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        nums.sort()
        res = sum(nums[0:3])
        for i in range(len(nums)-2): 
            l, r = i+1, len(nums)-1
            while l < r:
                s = nums[i] + nums[l] + nums[r]
                if s == target:
                    return s
                res = res if abs(s-target)>abs(res-target) else s
                if s>target:
                    r-=1
                else:
                    l+=1
        return res