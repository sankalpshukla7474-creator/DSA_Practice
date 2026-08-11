class Solution {
    List<List<Integer>> ls = new ArrayList<>() ;
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums) ;
        int n = nums.length ;
        for(int i = 0 ; i < n - 2 ; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue ;
            int tar = -1 * nums[i] ;
            int l = i + 1 , r = n - 1 ;
            while(l < r){
                int sum = nums[l] + nums[r] ;
                if(sum == tar){
                    List<Integer> pb = new ArrayList<>() ;
                    pb.add(nums[i]) ;
                    pb.add(nums[l]) ;
                    pb.add(nums[r]) ;
                    ls.add(pb) ;
                    while(l < r && nums[l] == nums[l+1]) l++ ;
                    while(r > l && nums[r] == nums[r-1]) r-- ;
                    l++; r--;
                }
                else if(sum > tar){
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