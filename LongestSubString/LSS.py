class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        ans, leng = 0, len(s)
        dic = {}
        j=0
        for i,n in enumerate(s):
            if n in dic.keys():
                j = max(dic[n],j)
            ans = max(ans,i-j+1)
            dic[n] = i+1
        return ans