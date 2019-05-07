class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        res = []
        self.subPermute(nums, res, [])
        return res
    
    def subPermute(self, nums, res, path):
        if not nums:
            res.append(path)
        
        for i in range(len(nums)):
            self.subPermute(nums[:i]+nums[i+1:], res, path+[nums[i]])
            