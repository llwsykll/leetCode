class Solution:
    def addBinary(self, a: 'str', b: 'str') -> 'str':
        lenA = len(a)-1
        lenB = len(b)-1
        result = ""
        c = 0
        while(lenA>=0 or lenB>=0 or c==1):
            aa = int(a[lenA]) if lenA>=0 else 0
            bb = int(b[lenB]) if lenB>=0 else 0
            result = str(aa^bb^c) + result
            c = 1 if aa+bb+c>=2 else 0
            lenA-=1
            lenB-=1
        return result

# 递归
class Solution:
    def addBinary(self, a: 'str', b: 'str') -> 'str':
        if len(a)==0: return b
        if len(b)==0: return a
        if int(a[-1])==1 and int(b[-1])==1:
            return self.addBinary(self.addBinary(a[0:-1],b[0:-1]),'1')+'0'
        elif int(a[-1])==0 and int(b[-1])==0:
            return self.addBinary(a[0:-1],b[0:-1])+'0'
        else:
            return self.addBinary(a[0:-1],b[0:-1])+'1'
            