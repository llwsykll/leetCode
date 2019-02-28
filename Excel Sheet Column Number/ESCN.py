class Solution:
    def titleToNumber(self, s: str) -> int:
        if len(s)==0: return 0
        sum=0
        for i in range(0,len(s)-1):
            sum+=(ord(s[i])-64)*pow(26,len(s)-1-i)
        sum += ord(s[len(s)-1])-64
        return sum