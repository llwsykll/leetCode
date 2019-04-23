# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def swapPairs(self, head: ListNode) -> ListNode:
        newHead = ListNode(0)
        newHead.next = head
        slow = fast = newHead
        fast = fast.next
        p = newHead
        i = 0
        while fast and fast.next:
            fast = fast.next
            slow = slow.next
            i += 1
            if i%2 != 0:
                temp = fast
                slow.next = fast.next
                fast.next = slow
                fast = slow.next
                p.next = temp
                p = temp.next
                i += 1
        return newHead.next
                
