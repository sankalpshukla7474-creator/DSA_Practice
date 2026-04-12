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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return ;
        ListNode slow = head ;
        ListNode fast = head ;
        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        ListNode curr = head ;
        while(curr.next != slow){
            curr = curr.next ;
        }
        curr.next = null ;
        ListNode p = head ;
        ListNode q = reverse(slow) ;
        ListNode dum = new ListNode(-1) ;
        curr = dum ;
        while(p != null && q != null){
            curr.next = p ;
            p = p.next ;
            curr = curr.next ;
            curr.next = q ;
            q = q.next ;
            curr = curr.next ;
        }
        if(q != null){
            curr.next = q ;
        }
        head = dum.next ;
        return ;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null ;
        ListNode curr = head ;
        while(curr != null){
            ListNode nxt = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = nxt ;
        }
        return prev ;
    }
}