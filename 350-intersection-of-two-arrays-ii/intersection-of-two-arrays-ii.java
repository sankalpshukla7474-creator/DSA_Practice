class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> hm1 = new HashMap<>() ;
        for(int x : nums1){
            hm1.put(x,hm1.getOrDefault(x,0)+1) ;
        }
        Map<Integer,Integer> hm2 = new HashMap<>() ;
        for(int x : nums2){
            hm2.put(x,hm2.getOrDefault(x,0)+1) ;
        }
        List<Integer> ls = new ArrayList<>() ;
        for(int x : hm1.keySet()){
            if(hm2.containsKey(x)){
                int min = Math.min(hm1.get(x),hm2.get(x)) ;
                for(int j = 1 ; j <= min ; j++){
                    ls.add(x) ;
                }
            }
        }
        int[] arr = new int[ls.size()] ;
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = ls.get(i) ;
        }
        return arr ;
    }

}