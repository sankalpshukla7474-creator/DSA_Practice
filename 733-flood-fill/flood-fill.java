class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int prev = image[sr][sc] ;
        if(prev == color) return image;
        boolean[][] visit = new boolean[image.length][image[0].length] ;
        dfs(image,sr,sc,color,prev,visit) ;
        return image ;
    }
    public void dfs(int[][] image , int i , int j , int color , int prev , boolean[][] visit ){
         if(i < 0 || i >= image.length || j < 0 || j >= image[0].length) return;

        if(visit[i][j] || image[i][j] != prev ) return ;
        image[i][j] = color ;
        visit[i][j] = true ;
        dfs(image,i+1,j,color,prev,visit) ;
        dfs(image,i,j+1,color,prev,visit) ;
        dfs(image,i-1,j,color,prev,visit) ;
        dfs(image,i,j-1,color,prev,visit) ;
    }
}