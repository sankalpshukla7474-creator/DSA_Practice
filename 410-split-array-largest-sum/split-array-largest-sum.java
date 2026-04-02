class Solution {
    public int splitArray(int[] num, int k) {
        if(k > num.length) return -1 ;
        int sum = 0 , max = 0 ;
        for(int x : num){
            sum += x ;
            max = Math.max(max,x) ;
        }
        int i = max , j = sum , ans = -1 ;
        while(i <= j){
            int mid = i + (j - i) / 2 ;
            int find = fun(num,mid) ;
            if(find <= k){
                ans = mid ;
                j = mid - 1 ;
            }
            else{
                i = mid + 1 ;
            }
        }
        return ans ;
    }
    public int fun(int[] num , int max){
        int sum = 0 , count = 1 ;
        for(int x : num){
            if(sum + x <= max){
                sum += x ;
            }
            else{
                sum = x ;
                count++ ;
            }
        }
        return count ;
    }
}