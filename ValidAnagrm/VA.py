class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!=len(t):return False
        dic1 = []
        dic2 = []
        for n in s:
            dic1.append(n)
        for  n in t:
            dic2.append(n)
        dic1.sort()
        dic2.sort()
        for i in range(0,len(s)):
            if dic1[i]!=dic2[i]:return False
        return True

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        return sorted(s) == sorted(t)