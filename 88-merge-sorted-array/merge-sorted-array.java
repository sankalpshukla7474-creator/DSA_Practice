class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> ls = new ArrayList<>() ;
        int i = 0 , j = 0 ;
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                ls.add(nums1[i]) ;
                i++ ;
            }
            else{
                ls.add(nums2[j]) ;
                j++ ;
            }
        }
        while(i < m){
            ls.add(nums1[i]) ;
            i++ ;
        }
        while(j < n){
            ls.add(nums2[j]) ;
            j++ ;
        }
        for(int l = 0 ; l < nums1.length ; l++){
            nums1[l] = ls.get(l) ;
        }
    }
}