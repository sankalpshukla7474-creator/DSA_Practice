class Solution {
    public int[] findMissingAndRepeatedValues(int[][] g) {
        int n = g.length * g.length ;
        int sum = (n*(n+1)) / 2 ;
        int[] arr = new int[2] ;
        Set<Integer> set = new HashSet<>() ;
        for(int i = 0 ; i < g.length ; i++){
            for(int j = 0 ; j < g.length ; j++){
                int num = g[i][j] ;
                if(!set.contains(num)){
                    sum -= num ;
                }
                else{
                    arr[0] = num ;
                }
                set.add(num) ;
            }
        }
        arr[1] = sum ;
        return arr ;
    }
}