class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray() ;
        int n = arr.length ;
        int i = 0 ; 
        while(i < n){
            if((i+2*k) < n){
                track(i,i+k-1,arr) ;
                i += 2*k ;
            }
            else{
                if(i+k >= n){
                    track(i,n-1,arr) ;
                    break ;
                }
                else{
                    track(i,i+k-1,arr) ;
                    i += 2*k ;
                }
            }
        }
        StringBuilder sb = new StringBuilder() ;
        for(char ch : arr){
            sb.append(ch) ;
        }
        return sb.toString() ;
    }
    public void track(int p , int q , char[] arr){
        int i = p , j = q ;
        while(i < j){
            char temp = arr[i] ;
            arr[i] = arr[j] ;
            arr[j] = temp ;
            i++ ; j-- ;
        }
        return ;
    }
}