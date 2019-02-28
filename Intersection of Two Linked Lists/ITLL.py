# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def getIntersectionNode(self, headA, headB):
        """
        :type head1, head1: ListNode
        :rtype: ListNode
        """
        if headA==None or headB==None:return None
        hA = headA
        hB = headB
        lenA = 0
        lenB = 0
        while hA!=None:
            lenA+=1
            hA = hA.next
        while hB!=None:
            lenB+=1
            hB = hB.next
        hB = headA
        hA = headB
        if lenB>lenA:
            for i in range(0,lenB-lenA):
                hA = hA.next
        if lenA>lenB:
            for i in range(0,lenA-lenB):
                hB = hB.next
        while hA!=None and hB!=None:
            if hA==hB: return hA
            hA=hA.next
            hB=hB.next
        return None
            

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def getIntersectionNode(self, headA, headB):
        """
        :type head1, head1: ListNode
        :rtype: ListNode
        """
        if headA==None or headB==None:return None
        hA = headA
        hB = headB
        while hA!=hB:
            hA = hA.next if hA!=None else headB
            hB = hB.next if hB!=None else headA
        return hA