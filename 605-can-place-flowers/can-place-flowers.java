class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        if (n == 0)
            return true;
        if (f.length == 1) {
            return f[0] == 0 ? true : false;
        }
        int count = 0;
        int i = 0;
        while (i < f.length) {
            if (count >= n)
                break;
            if (f[i] == 0) {
                if (i == 0) {
                    if (f[i + 1] != 1) {
                        f[i] = 1;
                        count++;
                    }
                } else if (i == f.length - 1) {
                    if (f[i - 1] != 1) {
                        f[i] = 1;
                        count++;
                    }

                } else if (f[i - 1] != 1 && f[i + 1] != 1) {
                    f[i] = 1;
                    count++;
                }
            }
            i++;
        }
        return count >= n;
    }
}