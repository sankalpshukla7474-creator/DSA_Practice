class Solution {
    public int[] twoSum(int[] num, int target) {
        int[] arr = new int[2] ;
        int l = 0 , r = num.length - 1 ;
        while(l < r){
            int sum = num[l] + num[r] ;
            if(sum == target){
                arr[0] = l+1 ;
                arr[1] = r+1 ;
                return arr ;
            }
            else if(sum > target){
                r-- ;
            }
            else{
                l++ ;
            }
        }
        return arr ;
    }
}