// not in-place
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode result = new ListNode(0);
        ListNode cur = result;
        cur.next = head;
        while(head!=null&&head.next!=null){
            if(head.val == head.next.val){
                // cur.next = head.next.next;
                head = head.next;
            }
            else{
                cur.next = head;
                cur = head;
                head = head.next;
            }
             
        }
        cur.next = head;
        return result.next;
    }
}

// in-place
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while(cur!=null&&cur.next!=null){
            if(cur.val==cur.next.val){
                cur.next = cur.next.next;
            }
            else{
                cur = cur.next;
            }
        }
        return head;
    }
}