class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>() ;
        Map<Integer,Integer> hm = new HashMap<>() ;
        for(int i = nums2.length -1 ; i >= 0 ; i--){
            while(!st.isEmpty() && st.peek() <= nums2[i]){
                st.pop() ;
            }
            int ans = st.isEmpty() ? -1 : st.peek() ;
            hm.put(nums2[i],ans) ;
            st.push(nums2[i]) ;
        }
        int[] arr = new int[nums1.length] ;
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = hm.get(nums1[i]) ;
        }
        return arr ;
    }
}