class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        dic = {}
        for n in magazine:
            if n in dic.keys():
                dic[n] = dic[n]+1
            else:dic[n] = 1
        for n in ransomNote:
            if n in dic.keys() and dic[n]>0:
                dic[n] =dic[n]-1
            else: return False
        return True

class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        arr = [0]*26
        for n in magazine:
            arr[ord(n)-ord('a')]+=1
        for n in ransomNote:
            if arr[ord(n)-ord('a')]<=0:return False
            else:arr[ord(n)-ord('a')]-=1
        return True