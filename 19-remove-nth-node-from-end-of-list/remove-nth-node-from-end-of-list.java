/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head ;
        ListNode dum = new ListNode(-1) ;
        dum.next = head ;
        ListNode slow = dum ;
        ListNode fast = dum ;
        while(n > 0){
            fast = fast.next ;
            n-- ;
        }
        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next ;
        }
        slow.next = slow.next.next ;
        return dum.next ;
    }
}