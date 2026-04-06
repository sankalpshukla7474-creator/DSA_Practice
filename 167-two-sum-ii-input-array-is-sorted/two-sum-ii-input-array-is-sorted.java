class Solution {
    public int[] twoSum(int[] num, int tar) {
        int[] arr = new int[2] ;
        int i = 0 , j = num.length - 1 ;
        while(i < j){
            if(num[i]+num[j] == tar){
                arr[0] = i+1 ;
                arr[1] = j+1 ;
                return arr ;
            }
            else if(num[i]+num[j] > tar){
                j-- ;
            }
            else{
                i++ ;
            }
        }
        return arr ;
    }
}