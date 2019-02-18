class Solution:
    def isValid(self, s: 'str') -> 'bool':
        arr = {')':'(','}':'{',']':'['}
        stack = []
        for ss in s:
            if ss in arr:
                if len(stack)== 0 or stack.pop()!= arr[ss]:
                    return False 
                
            else:
                stack.append(ss) 
        if len(stack)!=0:
            return False
        return True

# 定义字典，然后对应压栈判断是否相等