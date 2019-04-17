class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        array = [
            [],
            ['a','b','c'],
            ['d','e','f'],
            ['g','h','i'],
            ['j','k','l'],
            ['m','n','o'],
            ['p','q','r','s'],
            ['t','u','v'],
            ['w','x','y','z']
        ]
        if len(digits)==0:
            return []
        res = [char for char in array[int(digits[0])-1]]
        for i in range(1,len(digits)):
            new_row = []
            for re in res:
                for char in array[int(digits[i])-1]:
                    new = re + char
                    new_row.append(new)
            res = new_row
        return res
        