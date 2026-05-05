class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length ;
        int m = image[0].length ;
        boolean[][] visit = new boolean[n][m] ;
        int prev = image[sr][sc] ;
        dfs(image,sr,sc,n,m,color,visit,prev) ;
        return image ;
    }
    public void dfs(int[][] ima , int i , int j , int n , int m , int color , boolean[][] visit, int prev){
        if(i < 0 || i >= n || j < 0 || j >= m ) return ;
        if(visit[i][j] || ima[i][j] != prev) return ;
        ima[i][j] = color ;
        visit[i][j] = true ;
        dfs(ima,i+1,j,n,m,color,visit,prev) ;
        dfs(ima,i,j+1,n,m,color,visit,prev) ;
        dfs(ima,i-1,j,n,m,color,visit,prev) ;
        dfs(ima,i,j-1,n,m,color,visit,prev) ;
    }
}