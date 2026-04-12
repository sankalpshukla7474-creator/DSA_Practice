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
    public int[] nextLargerNodes(ListNode head) {
        if(head == null) return new int[0] ;
        List<Integer> ls = new ArrayList<>() ;
        ListNode curr = reverse(head) ;
        Stack<Integer> st = new Stack<>() ;
        while(curr != null){
            int num = curr.val ;
            while(!st.isEmpty() && st.peek() <= num){
                st.pop() ;
            }
            int ans = st.isEmpty() ? 0 : st.peek() ;
            ls.add(ans);
            st.push(num) ;
            curr = curr.next ;
        }
        int[] arr = new int[ls.size()] ;
        Collections.reverse(ls) ;
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = ls.get(i) ;
        }
        return arr ;
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
