class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length ;
        Stack<Integer> st = new Stack<>() ;
        int[] ans = new int[n] ;
        for(int i = n - 1 ; i >= 0 ; i--){
            while(!st.isEmpty() && temp[st.peek()] <= temp[i]){
                st.pop() ;
            }
            int an = st.isEmpty() ? 0 : st.peek() - i ;
            ans[i] = an ;
            st.push(i) ;
        }
        return ans ;
    }
}