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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head ;
        ListNode dum = new ListNode(-1);
        dum.next = head;
        ListNode p = dum;
        ListNode q = dum;
        while (left > 0) {
            p = p.next;
            left--;
        }
        while (right > 0) {
            q = q.next;
            right--;
        }
        ListNode r = dum ;
        while(r.next != p){
            r = r.next ;
        }
        r.next = null ;
        ListNode s = q.next ;
        q.next = null ;
        ListNode c = reverse(p) ;
        r.next = c ;
        ListNode ptr = dum ;
        while(ptr.next != null){
            ptr = ptr.next ;
        }
        ptr.next = s ;
        return dum.next ;
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