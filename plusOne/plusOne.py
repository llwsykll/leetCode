class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        if digits[-1]==9:
            i = len(digits)-1
            while(i>=0):
                if digits[i]==9:
                    digits[i]=0
                    if i==0:
                        digits.insert(0,1)
                else:
                    digits[i]+=1
                    break
                i-=1
        else:
            digits[-1]+=1
        return digits