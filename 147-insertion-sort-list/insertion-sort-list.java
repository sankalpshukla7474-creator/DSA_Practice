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
    public ListNode insertionSortList(ListNode head) {
        if(head == null) return head ;
        List<Integer> ls = new ArrayList<>() ;
        ListNode ptr = head ;
        while(ptr != null){
            ls.add(ptr.val) ;
            ptr = ptr.next ;
        }
        Collections.sort(ls) ;
        ptr = head ;
        int i = 0 ;
        while(ptr != null){
            ptr.val = ls.get(i) ;
            i++ ;
            ptr = ptr.next ;
        }
        return head ;
    }
}