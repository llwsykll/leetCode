# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def deleteDuplicates(self, head: 'ListNode') -> 'ListNode':
        result = cur = ListNode(0)
        cur.next = head
        while head!=None and head.next!=None:
            if head.val == head.next.val:
                head=head.next
            else:
                cur.next = head
                cur = head
                head = head.next
        cur.next = head
        return result.next

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def deleteDuplicates(self, head: 'ListNode') -> 'ListNode':
        cur = head
        while(cur!=None and cur.next!=None):
            if cur.val ==cur.next.val:
                cur.next = cur.next.next
            else:
                cur = cur.next
        return head