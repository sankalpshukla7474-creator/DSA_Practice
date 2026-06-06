class Solution {
    public int[] plusOne(int[] d) {
        int bor = 1 ;
        for(int i = d.length - 1 ; i >= 0 ; i--){
            if(bor == 0) break ;
            else{
                int num = d[i] + bor ;
                if(num > 9){
                    d[i] = 0 ;
                    bor = 1 ;
                }
                else{
                    d[i] = num ;
                    bor = 0 ;
                }
            }
        }
        if(bor == 0) return d ;
        int[] arr = new int[d.length + 1] ;
        arr[0] = 1 ;
        for(int i = 0 ; i < d.length ; i++){
            arr[i+1] = d[i] ;
        }
        return arr ;
    }
}