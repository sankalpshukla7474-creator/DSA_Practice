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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k == 1) return head ;
        ListNode dum = new ListNode(-1) ;
        dum.next = head ;
        ListNode p = head ;
        while(p != null){
            int num = k ;
            ListNode q = p ;
            while(num > 1 && q != null){
                q = q.next ;
                num--;
            }
            if(q == null) break ;
            ListNode r = dum ;
            while(r.next != p){
                r = r.next ;
            }
            ListNode s = q.next ;
            q.next = null ;
           ListNode i = reverse(p) ;
           r.next = i ;
           ListNode b = dum ;
           while(b.next != null){
            b = b.next ;
           }
           b.next = s ;
           if(s != null) p = s ;
           else break ;
        }
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