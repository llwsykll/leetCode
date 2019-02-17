class Solution:
    def reverse(self, x: 'int') -> 'int':
        max = pow(2,31)-1
        min = 0-pow(2,31)
        if x>max or x<min:
            return 0
        result = ''
        newX=abs(x)
        newX = str(newX)
        while len(newX)>0:
            result = result + newX[-1]
            newX = newX[0:-1]
        result = int(result)
        if x<0:
            result = 0-result
        if result>max or result<min:
            return 0
        else:
            return result
        