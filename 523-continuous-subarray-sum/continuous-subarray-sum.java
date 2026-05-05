class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<>() ;
        int ps = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            ps += nums[i] ;
            int find = ps % k ;
            if(hm.containsKey(find) && (i - hm.get(find) ) >= 2){
                return true ;
            }
            if(find == 0 && i >= 1){
                return true ;
            }
            if (!hm.containsKey(find)) {
    hm.put(find, i);
}
        }
        return false ;
    }
}