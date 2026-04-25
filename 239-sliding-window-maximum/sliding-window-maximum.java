class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> ls = new ArrayList<>() ;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->nums[b]-nums[a]) ;
        for(int i = 0 ; i < nums.length ; i++){
            pq.offer(i) ;
            while(pq.peek() <= i-k){
                pq.poll() ;
            }
            if(i >= k-1){
                ls.add(pq.peek()) ;
            }
        }
        int[] arr = new int[ls.size()] ;
        for(int i = 0 ; i < ls.size() ; i++){
            arr[i] = nums[ls.get(i)] ;
        }
        return arr ;
    }
}