class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i = 0 , j = 0 ;
        Arrays.sort(nums1) ;
        Arrays.sort(nums2) ;
        List<Integer> ls = new ArrayList<>() ;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] > nums2[j]){
                j++ ;
            }
            else if(nums1[i] < nums2[j]){
                i++ ;
            }
            else{
                ls.add(nums1[i]) ;
                i++ ; j++ ;
            }
        }
        int[] arr = new int[ls.size()] ;
        for(int p = 0 ; p < arr.length ; p++){
            arr[p] = ls.get(p) ;
        }
        return arr ;
    }
}