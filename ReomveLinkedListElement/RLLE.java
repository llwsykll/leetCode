/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode result = newHead;
        while(newHead.next!=null){
            if(newHead.next.val == val){
                newHead.next = newHead.next.next;
            }else{
                newHead = newHead.next;
            }
        }
        return result.next;
    }
}