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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head ;
        int n = 0 ;
        ListNode ptr = head ;
        while(ptr != null){
            ptr = ptr.next ;
            n++ ;
        }
        k = k % n ;
        if(k == n || k == 0) return head ;
        k = n - k ; 
        ptr = head ;
        while(k > 0){
            ptr = ptr.next ;
            k-- ;
        }
        ListNode p = head ;
        while(p.next != ptr){
            p = p.next ;
        }
        p.next = null ;
        ListNode q = ptr ;
        while(q.next != null){
            q = q.next ;
        }
        q.next = head ;
        return ptr ;
    }
}