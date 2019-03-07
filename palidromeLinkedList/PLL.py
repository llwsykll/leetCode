# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def isPalindrome(self, head: ListNode) -> bool:
        prev = None
        cur = head
        fast= head
        while fast!=None and fast.next!=None:
            fast = fast.next.next
            temp = cur.next
            cur.next = prev
            prev = cur
            cur = temp
        if fast:
            cur = cur.next
        while prev !=None and cur!=None:
            if prev.val!=cur.val: return False
            prev = prev.next
            cur = cur.next
        return True


class MyQueue:

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.stack1 = []

    def push(self, x: int) -> None:
        """
        Push element x to the back of queue.
        """
        self.stack1.append(x)
        

    def pop(self) -> int:
        """
        Removes the element from in front of queue and returns that element.
        """
        return self.stack1.pop(0)
        

    def peek(self) -> int:
        """
        Get the front element.
        """
        return self.stack1[0]

    def empty(self) -> bool:
        """
        Returns whether the queue is empty.
        """
        return len(self.stack1)==0


# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()