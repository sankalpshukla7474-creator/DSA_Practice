class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1) ;
        Arrays.sort(nums2) ;
        List<Integer> ls = new ArrayList<>(); 
        int i = 0 , j = 0 ;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] > nums2[j]) j++ ;
            else if(nums2[j] > nums1[i]) i++ ;
            else if(nums1[i] == nums2[j]){
                ls.add(nums1[i]) ;
                i++ ; j++ ;
            }
        }
        int[] arr = new int[ls.size()] ;
        int p = 0 ;
        for(int x : ls){
            arr[p] = x ;
            p++ ;
        }
        return arr ;
    }
}