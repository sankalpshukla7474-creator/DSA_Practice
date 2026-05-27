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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head ;
        ListNode prev = null ;
        ListNode curr = head ;
        Set<Integer> st = new HashSet<>() ;
        while(curr != null){
            if(prev != null && curr.val == prev.val){
                st.add(prev.val) ;
            }
            prev = curr ;
            curr = curr.next ;
        }
        while(head != null && st.contains(head.val)){
            head = head.next ;
        }
        curr = head ;
        prev = null ;
        while(curr != null){
            if(prev != null && st.contains(curr.val)){
                prev.next = curr.next ;
            }
            else{
                prev = curr ;
            }
            curr = curr.next ;
        }
        return head ;
    }
}