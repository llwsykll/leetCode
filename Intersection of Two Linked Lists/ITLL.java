/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA ==null || headB==null) return null;
        ListNode hA = headA;
        ListNode hB = headB;
        int lenA = 0;
        int lenB = 0;
        while(hA.next!=null){
            lenA++;
            hA = hA.next;
        }
        while(hB.next!=null){
            lenB++;
            hB = hB.next;
        }
        hA = headA;
        hB = headB;
        if(lenB>lenA){
            int i = 0;
            while (i<lenB-lenA){
                hB = hB.next;
                i++;
            }
        }
        if(lenB<lenA){
            int i = 0;
            while (i<lenA-lenB){
                hA = hA.next;
                i++;
            }
        }
        while(hA!=null && hB!=null){
            if(hA == hB) return hA;
            hA = hA.next;
            hB = hB.next;
        }
        return null;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        ListNode h1 = headA; 
        ListNode h2 = headB;
        while(h1!=h2){
            h1 = h1 == null?headB:h1.next;
            h2 = h2 == null?headA:h2.next;
        }
        return h1;
    }
}