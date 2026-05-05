class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<>() ;
        int ps = 0 ;
        hm.put(0,1) ;
        int count = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            ps += nums[i] ;
            int find = ps % k ;
            if(find < 0){
                find += k ;
            }
            if(hm.containsKey(find)){
                count += hm.get(find) ;
            }
            hm.put(find,hm.getOrDefault(find,0)+1) ;
        }
        return count ;
    }
}