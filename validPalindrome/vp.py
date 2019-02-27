class Solution:
    def isPalindrome(self, s: str) -> bool:
        i,j = 0,len(s)-1
        while i<j:
            if not s[i].isalnum():
                i+=1
                continue
            if not s[j].isalnum():
                j-=1
                continue
            if s[i].lower() != s[j].lower():return False
            i+=1
            j-=1
        return True
                

class Solution:
    def isPalindrome(self, s: str) -> bool:
        sNew = list(filter(str.isalnum, s))
        sNew =''.join(sNew)
        if sNew.lower() != sNew[::-1].lower():return False
        return True
                