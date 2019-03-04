# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def removeElements(self, head: ListNode, val: int) -> ListNode:
        if head == None: return 
        newHead = ListNode(-1)
        newHead.next = head
        result = newHead
        cur = head
        while cur!=None:
            if cur.val == val:
                newHead.next = cur.next
                cur = cur.next
            else: 
                newHead = cur
                cur = cur.next
        return result.next
    
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def removeElements(self, head: ListNode, val: int) -> ListNode:
        newHead = ListNode(-1)
        newHead.next = head
        result = newHead
        while newHead.next!=None:
            if newHead.next.val == val:
                newHead.next = newHead.next.next
            else: 
                newHead = newHead.next
        return result.next
    
                