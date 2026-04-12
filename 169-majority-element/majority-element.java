class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> hm = new HashMap<>() ;
        for(int x : nums){
            hm.put(x,hm.getOrDefault(x,0)+1) ;
        }
        int ans = -1 ;
        int tar = nums.length / 2 ;
        for(int x : hm.keySet()){
            if(hm.get(x) > tar){
                ans = x ;
            }
        }
        return ans ;
    }
}