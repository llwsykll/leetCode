/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ListNode cur = head;
        while(head!=null){
            arr.add(head.val);
            head =head.next;
        }
        for(int i = arr.size()-1;i>0;i--){
            if(!arr.get(i).equals(cur.val)) return false;
            cur =cur.next;
        }
        return true;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        if (fast!=null) slow = slow.next;
        while(prev!=null){
            if(prev.val!=slow.val) return false;
            prev = prev.next;
            slow = slow.next;
        }
        return true;
    }
}