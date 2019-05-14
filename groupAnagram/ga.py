class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dic = {}
        i = 0
        for s in strs:
            l=list(s)
            l.sort()
            news="".join(l)
            if news in dic.keys():
                dic[news].append(s)
            else:
                dic[news] = [s]
        return list(dic.values())