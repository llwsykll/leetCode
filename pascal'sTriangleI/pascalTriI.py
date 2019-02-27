class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        nums = [[0 for j in range(i+1)] for i in range(numRows)]
        if numRows<=0:return nums
        for i in range(0,numRows):
            for j in range(0,i+1):
                if j==0 or j==i: nums[i][j] = 1
                else: nums[i][j] = nums[i-1][j-1]+nums[i-1][j]
            i+=1
        return nums
            