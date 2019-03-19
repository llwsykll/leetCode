class Solution:
    def longestPalindrome(self, s: str) -> int:
        num = list(collections.Counter(s).values())
        num1 = [0]+[n for n in num if n%2==0]
        num2 = [0]+[n-1 for n in num if n%2==1]
        res = 0
        if len(num2)>1:
            res=1
        return sum(num1)+sum(num2)+res


class Solution:
    def longestPalindrome(self, s: str) -> int:
        num = list(collections.Counter(s).values())
        res = 0
        for n in num:
            res+=n-n%2
            if n%2==1 and res%2==0:
                res+=1
        return res