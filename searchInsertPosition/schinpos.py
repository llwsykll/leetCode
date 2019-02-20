class Solution:
    def searchInsert(self, nums: 'List[int]', target: 'int') -> 'int':
        pos=0
        for n in nums:
            if(n<target):
                pos+=1
        return pos

class Solution:
    def searchInsert(self, nums: 'List[int]', target: 'int') -> 'int':
        begin,end=0,len(nums)-1
        while(begin<=end):
            mid = int((begin+end)/2)
            if nums[mid]==target:
                return mid
            elif nums[mid]>target:
                end = mid-1
            else:
                begin = mid+1
        return begin