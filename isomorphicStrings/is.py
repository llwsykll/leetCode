class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t): return False
        dic = {}
        dic2 = {}
        for i in range(0,len(s)):
            if s[i] in dic:
                if t[i] != dic[s[i]]:
                    return False
            if t[i] in dic2:
                if s[i] !=dic2[t[i]]:
                    return False
            dic[s[i]] = t[i]
            dic2[t[i]] = s[i]
            
        print(dic)
        print(dic2)
        return True