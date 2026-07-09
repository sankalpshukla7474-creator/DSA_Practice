class Solution {
    public boolean checkValidGrid(int[][] grid) {
        int n = grid.length ;
        return pass(grid,0,0,0,n) ;
    }
    public boolean pass(int[][] g , int i , int j , int idx , int n){
        if(i < 0 || i >= n || j < 0 || j >= n || g[i][j] != idx) return false ;
        if(idx == (Math.pow(n,2)-1)) return true ;
        boolean q = pass(g,i-2,j+1,idx+1,n) ;
        boolean w = pass(g,i+2,j+1,idx+1,n) ;
        boolean e = pass(g,i-2,j-1,idx+1,n) ;
        boolean r = pass(g,i+2,j-1,idx+1,n) ;
        boolean t = pass(g,i-1,j+2,idx+1,n) ;
        boolean y = pass(g,i+1,j+2,idx+1,n) ;
        boolean u = pass(g,i-1,j-2,idx+1,n) ;
        boolean v = pass(g,i+1,j-2,idx+1,n) ;
        return (q || w || e || r || t || y || u || v ) ;
    }
}