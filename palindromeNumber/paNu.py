class Solution:
    def isPalindrome(self, x: 'int') -> 'bool':
        if x<0:
            return False
        re = 0
        num = x
        while(num>0):
            re = re*10 + num%10
            num = int(num/10)
        if re==x:
            return True
        else:
            return False