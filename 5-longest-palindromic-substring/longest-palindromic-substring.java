class Solution {
    public String longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (track(arr, i, j)) {
                    if (j - i + 1 > max) {
                        fill(sb, i, j, arr);
                        max = j - i + 1;
                    }
                }
            }
        }
        return sb.toString();
    }

    public boolean track(char[] arr, int i, int j) {
        if (i >= arr.length || j < 0) return false;
        while (i <= j) {
            if (arr[i] != arr[j]) return false;
            i++;
            j--;
        }
        return true;
    }

    public void fill(StringBuilder sb, int i, int j, char[] arr) {
        sb.setLength(0); 
        for (int p = i; p <= j; p++) {
            sb.append(arr[p]);
        }
    }
}