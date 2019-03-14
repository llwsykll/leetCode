class Solution:
    def firstUniqChar(self, s: str) -> int:
        dic = {}
        for n in s:
            if n in dic.keys():dic[n]=dic[n]+1
            else: dic[n]=1
        for i in range(0,len(s)):
            if dic[s[i]] == 1:return i
        return -1

class Solution:
    def firstUniqChar(self, s: str) -> int:
        letter = [chr(a) for a in range(ord('a'),ord('z')+1)]
        index = [s.index(l) for l in letter if s.count(l)==1]
        return min(index) if len(index)>0 else -1