class Solution {
    public int distributeCandies(int[] can) {
        Set<Integer> st = new HashSet<>() ;
        for(int x : can){
            st.add(x) ;
        }
        int tar = can.length / 2 ;
        if(st.size() <= tar) return st.size() ;
        return tar ;
    }
}