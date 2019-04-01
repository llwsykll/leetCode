# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        head3 = ListNode(0)
        cur = head3
        carry = 0
        while l1 or l2 or carry:
            val = 0
            if l1:
                val+=l1.val
                l1 = l1.next
            if l2:
                val+=l2.val
                l2 = l2.next
            val += carry
            cur.val = val %10
            carry = val//10
            if l1 or l2 or carry:
                cur.next = ListNode(val)
                cur = cur.next
        return head3