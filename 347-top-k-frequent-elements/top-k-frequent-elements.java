class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int x : nums) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        List<Integer>[] bucket = new List[nums.length+1];
        for (int key : hm.keySet()) {
            int fre = hm.get(key);
            if (bucket[fre] == null) {
                bucket[fre] = new ArrayList<>();
            }
            bucket[fre].add(key);
        }
        int[] arr = new int[k];
        int idx = 0;
        for (int i = bucket.length - 1; i >= 0 && idx < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    arr[idx++] = num;
                    if (idx == k)
                        break;
                }
            }
        }
        return arr;
    }
}