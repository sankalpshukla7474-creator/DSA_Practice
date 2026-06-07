class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1) ;
        Arrays.sort(nums2) ;
        int i = 0 , j = 0 ;
        List<Integer> ls = new ArrayList<>() ;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){ i++ ;}
            else if(nums2[j] < nums1[i]){j++ ;}
            else{
                ls.add(nums1[i]) ;
                i++ ; j++ ;
            }
        } 
        int[] arr = new int[ls.size()] ;
        for(i = 0 ; i < arr.length ; i++){
            arr[i] = ls.get(i) ;
        }
        return arr ;
    }
}