class Solution {
    public int[] sortArray(int[] nums) {
        if (nums.length == 0) return nums;

        merge_sort(nums, 0, nums.length - 1);
        return nums;
    }

    public void merge_sort(int[] nums, int i, int j) {
        if (i < j) {
            int mid = i + (j - i) / 2;

            merge_sort(nums, i, mid);
            merge_sort(nums, mid + 1, j);

            merge(nums, i, mid, j);
        }
    }

    public void merge(int[] nums, int i, int mid, int j) {
        int n1 = mid - i + 1;
        int n2 = j - mid;
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        for (int k = 0; k < n1; k++) {
            arr1[k] = nums[i + k];
        }
        for (int k = 0; k < n2; k++) {
            arr2[k] = nums[mid + 1 + k];
        }
        int q = 0;
        int w = 0;
        int idx = i;
        while (q < n1 && w < n2) {
            if (arr1[q] <= arr2[w]) {
                nums[idx] = arr1[q];
                q++;
            } else {
                nums[idx] = arr2[w];
                w++;
            }
            idx++;
        }
        while (q < n1) {
            nums[idx] = arr1[q];
            q++;
            idx++;
        }
        while (w < n2) {
            nums[idx] = arr2[w];
            w++;
            idx++;
        }
    }
}