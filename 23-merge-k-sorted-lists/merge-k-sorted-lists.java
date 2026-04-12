class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> ls = new ArrayList<>() ;
        for(int i = 0 ; i < lists.length ; i++){
            ListNode head = lists[i] ;
            while(head != null){
                ls.add(head.val) ;
                head = head.next ;
            }
        }
        Collections.sort(ls) ;
        ListNode dum = new ListNode(-1) ;
        ListNode curr = dum ;
        for(int x : ls){
            curr.next = new ListNode(x) ;
            curr = curr.next ;
        }
        return dum.next ;
    }
}