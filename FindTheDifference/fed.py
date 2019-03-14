class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        dic = {}
        for n in s:
            if n in dic.keys():dic[n] += 1
            else: dic[n] = 1
        for n in t:
            if n in dic.keys() and dic[n]>0:dic[n]-=1
            else: return n
        return 

class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        arr1 = [0]*26
        for n in s: 
            arr1[ord(n)-ord('a')]+=1
        for n in t:
            if arr1[ord(n)-ord('a')]>0:
                arr1[ord(n)-ord('a')]-=1
            else :return n
        return 