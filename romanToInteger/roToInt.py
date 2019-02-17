class Solution:
    def romanToInt(self, s: 'str') -> 'int':
        arr = {'I':1,
              'V':5,
              'X':10,
              'L':50,
              'C':100,
              'D':500,
              'M':1000}
        i,total=0,0
        while(i<len(s)-1):
            if(arr[s[i]]<arr[s[i+1]]):
                total-=arr[s[i]]
            else:
                total+=arr[s[i]]
            i+=1
        total+=arr[s[-1]]
        return total
                