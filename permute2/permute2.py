class Solution:
    def permuteUnique(self, nums: List[int]) -> List[List[int]]:
        if not nums:
            return []
        return self.permute(sorted(nums))

    def permute(self, num):
        if len(num) == 1:
            return [num]

        ret = []
        for index, elt in enumerate(num):
            if index > 0 and num[index - 1] == elt:
                continue
            ret += [[elt] + p for p in self.permute(num[:index] + num[index + 1:])]
        return ret