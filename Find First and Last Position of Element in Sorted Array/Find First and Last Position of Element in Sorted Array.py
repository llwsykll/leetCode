class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        start = 0
        end = len(nums)-1
        result = []

        while start <= end:
            mid = start + (end-start)//2
            if nums[mid] < target:
                start = mid + 1
            else:
                end = mid - 1
        result.append(start)


        start = 0
        end = len(nums)-1

        while start <= end:
            mid = start + (end-start)//2
            if nums[mid]  > target:
                end = mid -1
            else:
                start = mid + 1
        result.append(end)

        if result[0] > result[1]:
            return [-1, -1]
        else:
            return result