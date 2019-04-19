# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        newHead = ListNode(0)
        newHead.next = head
        fast = slow = newHead
        i = 0 
        while i <= n and fast != None:
            fast = fast.next
            i+=1
        while fast != None:
            fast = fast.next
            slow = slow.next
        slow.next = slow.next.next
        return newHead.next