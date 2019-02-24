class Solution:
    def merge(self, nums1: 'List[int]', m: 'int', nums2: 'List[int]', n: 'int') -> 'None':
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i= m+n-1
        m-=1
        n-=1
        while m>-1 or n>-1:
            if m>-1 and n>-1:
                if nums1[m]>nums2[n]:
                    nums1[i]=nums1[m]
                    m-=1
                else:
                    nums1[i]=nums2[n]
                    n-=1
            elif m<0:
                nums1[i]=nums2[n]
                n-=1
            elif n<0:
                nums1[i]=nums1[m]
                m-=1
            i-=1
            

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        for i in range(m,m+n):
            nums1[i] = nums2[n-1]
            n-=1
        nums1.sort()