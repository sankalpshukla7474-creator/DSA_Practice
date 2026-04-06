class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1) ;
        Arrays.sort(nums2) ;
        List<Integer> ls = new ArrayList<>() ;
        int i = 0 , j = 0 ;
        while(i < nums1.length && j < nums2.length ){
            if(nums1[i] < nums2[j]) i++ ;
            else if(nums2[j] < nums1[i]) j++ ;
            else if(nums1[i] == nums2[j]){
                if(ls.size() == 0) ls.add(nums1[i]) ;
                else{
                    if(ls.get(ls.size()-1) != nums1[i]){
                        ls.add(nums1[i]) ;
                    }
                }
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