class NumArray:

    def __init__(self, nums: List[int]):
        if len(nums)==0:return 
        self.data = []
        self.data.append(nums[0])
        for i in range(1,len(nums)):
            self.data.append(nums[i] + self.data[i-1])

    def sumRange(self, i: int, j: int) -> int:
        return self.data[j] - self.data[i-1] if i!= 0 else self.data[j]


# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(i,j)
