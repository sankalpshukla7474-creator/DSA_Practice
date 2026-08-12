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
        if(head == null || head.next == null) return head ;
        ListNode dum = new ListNode(-1) ;
        dum.next = head ;
        ListNode ptr1 = dum , ptr2 = dum ;
        while(left != 0 || right != 0){
            if(left != 0){
                ptr1 = ptr1.next ;
                left-- ;
            }
            if(right != 0){
                ptr2 = ptr2.next ;
                right-- ;
            }
        }
        ListNode start = dum ;
        while(start.next != ptr1){
            start = start.next ;
        }
        ListNode end = ptr2.next ;
        ptr2.next = null ;
        ListNode joint = reverse(ptr1) ;
        start.next = joint ;
        while(joint.next != null){
            joint = joint.next ;
        }
        joint.next = end ;
        return dum.next ;
    }
    public ListNode reverse(ListNode ptr){
        ListNode prev = null ;
        while(ptr != null){
            ListNode nxt = ptr.next ;
            ptr.next = prev ;
            prev = ptr ;
            ptr = nxt ;
        }
        return prev ;
    }
}