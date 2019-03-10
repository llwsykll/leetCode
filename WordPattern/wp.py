class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        arr = str.split(" ")
        dic1 = {}
        dic2 = {}
        if len(pattern)!=len(arr): return False
        for i in range(0,len(arr)):
            if pattern[i] in dic1:
                if dic1[pattern[i]] != arr[i]:return False
            dic1[pattern[i]] = arr[i]
        for i in range(0,len(arr)):
            if arr[i] in dic2:
                if dic2[arr[i]] != pattern[i]:return False
            dic2[arr[i]] = pattern[i]
        return True