class Solution:
    def lengthOfLastWord(self, s: 'str') -> 'int':
        s=s.rstrip()
        sArr = s.split(' ')
        return len(sArr[len(sArr)-1])