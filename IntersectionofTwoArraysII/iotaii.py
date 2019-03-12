class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        nums1,nums2 = sorted(nums1),sorted(nums2)
        result = []
        p1,p2 = 0,0
        while p1<len(nums1) and p2<len(nums2):
            if nums1[p1] == nums2[p2]:
                result.append(nums1[p1])
                p1+=1
                p2+=1
            elif nums1[p1]>nums2[p2]:p2+=1
            else: p1+=1
        return result