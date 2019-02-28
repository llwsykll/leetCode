class MinStack:

    def __init__(self):
        """
        initialize your data structure here.
        """
        self.s = []

    def push(self, x):
        """
        :type x: int
        :rtype: None
        """
        self.s.append(x)
        

    def pop(self):
        """
        :rtype: None
        """
        self.s.pop()

    def top(self):
        """
        :rtype: int
        """
        if len(self.s) == 0:return None
        return self.s[len(self.s)-1]

    def getMin(self):
        """
        :rtype: int
        """
        if len(self.s)==0:return 0
        minn = self.s[0]
        for n in self.s:
            minn = min(minn,n)
        return minn

        


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(x)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()