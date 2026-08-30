class Solution {
    public int projectionArea(int[][] grid) {
        int totalarea = 0;
        int n = grid.length;

        for (int i = 0; i < n; i++) {
            int Rmax = 0;
            int Cmax = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    totalarea++;
                }

                Rmax = Math.max(Rmax, grid[i][j]);
                Cmax = Math.max(Cmax, grid[j][i]);
            }
            totalarea += Rmax;
            totalarea += Cmax;
        }

        return totalarea;
    }
}