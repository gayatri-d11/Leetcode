class Solution {
    public int surfaceArea(int[][] grid) {
        int n = grid.length;
        int totalarea = 0;
        for(int r=0;r<n;r++){
            for(int c =0;c<n;c++){
                int v = grid[r][c];
                if(v>0){
                    totalarea+=2+(4*v);
                }
                if(r>0){
                    totalarea-=2*Math.min(v,grid[r-1][c]);
                }
                 if(c>0){
                    totalarea-=2*Math.min(v,grid[r][c-1]);
                }
            }
        }
        return totalarea;
    }
}