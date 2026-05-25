class Solution {
    List<List<Integer>> ls ;
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums) ;
        int n = nums.length ;
        ls = new ArrayList<>() ;
        for(int i = 0 ; i <= n-4 ; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue ;
            long sum = target - nums[i] ;
            three_sum(nums,i+1,n-1,sum,nums[i]) ;
        }
        return ls ;
    }
    public void three_sum(int[] arr , int l , int r , long tar,int prev){
        for(int i = l ; i < arr.length - 2 ; i++){
            if(i > l && arr[i] == arr[i-1]) continue ;
            long find = tar - arr[i] ;
            int p = i+1 , q = arr.length - 1 ;
            while(p < q){
                int total = arr[p] + arr[q] ;
                if(find == total){
                    List<Integer> pb = new ArrayList<>() ;
                    pb.add(prev) ;
                    pb.add(arr[i]) ;
                    pb.add(arr[p]) ;
                    pb.add(arr[q]) ;
                    ls.add(new ArrayList<>(pb)) ;
                    while(p < q && arr[p] == arr[p+1]) p++ ;
                    while(q > p && arr[q] == arr[q-1]) q-- ;
                    p++; q-- ;
                }
                else if(total > find) q-- ;
                else p++ ;
            }
        }
    }
}