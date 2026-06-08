class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2] ;
        arr[0] = first(nums,target,0,nums.length-1,-1) ;
        arr[1] = second(nums,target,0,nums.length-1,-1) ;
        return arr ;
    }
    public int first(int[] nums , int tar , int i , int j , int ans){
        while(i <= j){
            int mid = i + (j - i) / 2 ;
            if(nums[mid] == tar){
                ans = mid ;
                j = mid - 1 ;
            }
            else if(nums[mid] > tar){
                j = mid - 1 ;
            }
            else{
                i = mid + 1 ;
            }
        }
        return ans ;
    }
    public int second(int[] nums , int tar , int i , int j , int ans){
        while(i <= j){
            int mid = i + (j - i) / 2 ;
            if(nums[mid] == tar){
                ans = mid ;
                i = mid + 1 ;
            }
            else if(nums[mid] < tar){
                i = mid + 1 ;
            }
            else{
                j = mid - 1 ;
            }
        }
        return ans ;
    }
}