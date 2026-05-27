class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>() ;
        Arrays.sort(nums) ;
        for(int i = 0 ; i < nums.length - 2 ; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue ;
            int tar = -1 * nums[i] ;
            int l = i+1 , r = nums.length - 1 ;
            while(l < r){
                int total = nums[l] + nums[r] ;
                if(total == tar){
                    List<Integer> pb = new ArrayList<>() ;
                    pb.add(nums[i]) ; pb.add(nums[l]) ; pb.add(nums[r]) ;
                    ls.add(new ArrayList<>(pb)) ;
                    while(l < r && nums[l] == nums[l+1]) l++ ;
                    while(r > l && nums[r] == nums[r-1]) r-- ;
                    l++ ; r-- ;
                }
                else if(total > tar){
                    r-- ;
                }
                else{
                    l++ ;
                }
            }
        }
        return ls ;
    }
}