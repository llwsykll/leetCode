class Solution:
    def reverseVowels(self, s: str) -> str:
        left,right = 0,len(s)-1
        li = list(s)
        arr = ['a','e','i','o','u','A','E','I','O','U']
        while left<right:
            if li[left] in arr and li[right] in arr:
                li[left],li[right] = li[right],li[left]
                left+=1
                right-=1
            if not li[left] in arr:left+=1
            if not li[right] in arr:right-=1         
        return ''.join(li)