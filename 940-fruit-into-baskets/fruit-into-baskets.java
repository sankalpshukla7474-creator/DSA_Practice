class Solution {
    public int totalFruit(int[] f) {
        int max = 0 ;
        int i = 0 ;
        HashMap<Integer,Integer> hm = new HashMap<>() ;
        for(int j = 0 ; j < f.length ; j++){
            hm.put(f[j],hm.getOrDefault(f[j],0)+1) ;
            while(hm.size() > 2){
                hm.put(f[i],hm.get(f[i])-1) ;
                if(hm.get(f[i]) == 0) hm.remove(f[i]) ;
                i++ ;
            }
            max = Math.max(max,j-i+1) ;
        }
        return max ;
    }
}