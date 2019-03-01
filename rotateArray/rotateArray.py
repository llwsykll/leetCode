#先将整个数组倒过来，再把k前k后分别倒过来

#使用resversd
class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        k = k%len(nums)
        nums[:] = nums[::-1]
        nums[0:k] = list(reversed(nums[0:k]))
        nums[k:] = list(reversed(nums[k:]))
            
#切片
class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        k = k%len(nums)
        if k==0 : pass
        else:
            nums[:] = nums[::-1]
            print(nums)
            nums[0:k] = nums[k-1::-1]
            print(nums)
            nums[k:] = nums[:k-1:-1]
            print(nums)
            


#py可直接重新定义整个数组
class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        lenn = len(nums)
        k=k%lenn
        nums[:] = nums[lenn-k:]+nums[:lenn-k]