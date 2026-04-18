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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head ;
        ListNode p = head ;
        ListNode q = head.next ;
        ListNode dum = new ListNode(-1) ;
        dum.next = head ;
        while(p != null && q != null){
            ListNode r = dum ;
            while(r.next != p){
                r = r.next ;
            }
            ListNode s = dum ;
            while(s != q){
                s = s.next ;
            }
            s = s.next ;
            r.next = q ;
            q.next = p ;
            p.next = s ;
            if(s != null) p = s ;
            else{
                p = null ;
                break ;
            } 
            if(p.next != null) q = p.next ; 
            else{
                q = null ; 
                break ;
            }
        }
        return dum.next ;
    }
}