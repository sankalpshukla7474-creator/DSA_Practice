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
    public int getDecimalValue(ListNode head) {
        if(head == null) return 0 ;
        ListNode ptr = reverse(head) ;
        int i = 0 , sum = 0 ;
        while(ptr != null){
            if(ptr.val != 0){
                sum += Math.pow(2,i) ;
            }
            ptr = ptr.next ;
            i++ ;
        }
        return sum ;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null ;
        while(head != null){
            ListNode nxt = head.next ;
            head.next = prev ;
            prev = head ;
            head = nxt ;
        }
        return prev ;
    }
}