class Solution {
    public int oddCells(int m, int n, int[][] indices) {
      int count =0;
      int row[] = new int[m]; 
      int col[] = new int[n];

      for(int x[]:indices){
        row[x[0]]++;
        col[x[1]]++;
        //row[0]++
        //col[1]++
       // row[1]++
       //col[1]++
        //row = [1,1]
        //col = [0,2,0]
      }

      for(int i=0;i<m;i++){
        for(int j =0;j<n;j++){
            if((row[i]+col[j])%2!=0)
            count++;
            //for row 0
            //Cell	Value
            //(0,0)	1+0 = 1
            //(0,1)	1+2 = 3
            //(0,2)	1+0 = 1
        }
      }
      return count;
    }
}