class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        dic = {}
        for i,num in enumerate(numbers):
            if target-numbers[i] in dic:
                return [dic[target-numbers[i]]+1,i+1]
            dic[num] = i 
        return None