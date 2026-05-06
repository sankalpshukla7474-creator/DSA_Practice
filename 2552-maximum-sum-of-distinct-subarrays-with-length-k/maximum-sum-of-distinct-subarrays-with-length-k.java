class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<>() ;
        long max = 0 , sum = 0 ;
        int i = 0 ;
        int n = nums.length ;
        for(int j = 0 ; j < n ; j++){
            hm.put(nums[j],hm.getOrDefault(nums[j],0)+1) ;
            sum += nums[j] ;
            if(hm.size() > k){
                hm.put(nums[i],hm.get(nums[i])-1) ;
                if(hm.get(nums[i]) == 0){
                    hm.remove(nums[i]) ;
                }
                sum -= nums[i] ;
                i++ ;
            }
            while(hm.get(nums[j]) > 1){
                hm.put(nums[i],hm.get(nums[i])-1) ;
                if(hm.get(nums[i]) == 0){
                    hm.remove(nums[i]) ;
                }
                sum -= nums[i] ;
                i++ ;
            }
            if(hm.size() == k){
                max = Math.max(max,sum) ;
            }
        }
        return max ;
    }
}