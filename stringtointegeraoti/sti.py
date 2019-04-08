class Solution:
    def myAtoi(self, str: str) -> int:
        s = str.strip()
        if len(s)==0:
            return 0
        sign,i,n = 1,0,0
        if s[0] == '-':
            sign = -1
            i += 1
        if s[0] == '+':
            i += 1
        while i<len(s):
            if s[i].isdigit() == True:
                n = n*10 + ord(s[i])-ord('0')
                i += 1
            else:
                break
        return sign*min(2**31-1,n) if sign>0 else sign*min(2**31,n)
                
        