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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 != null) return l2 ;
        if(l1 != null && l2 == null) return l1 ;
        if(l1 == null && l2 == null) return null ;
        ListNode dum = new ListNode(-1) ;
        ListNode ptr = dum ;
        ListNode p = l1 ;
        ListNode q = l2 ;
        while(p != null && q != null){
            if(p.val <= q.val){
                ptr.next = p ;
                p = p.next ;
            }
            else{
                ptr.next = q ;
                q = q.next ;
            }
            ptr = ptr.next ;
        }
        while(p != null){
            ptr.next = p ;
            p = p.next ;
            ptr = ptr.next ;
        }
        while(q != null){
            ptr.next = q ;
            q = q.next ;
            ptr = ptr.next ;
        }
        return dum.next ;
    }
}