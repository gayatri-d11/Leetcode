class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
      
        List<Integer>arr = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
             int min = Integer.MAX_VALUE;
              int m=0;
            for(int j=0;j<matrix[0].length;j++){
              if( matrix[i][j]<min ){
                min =matrix[i][j];
                m=j;

              }
            }
                 boolean lucky = true;
                for(int k=0;k<matrix.length;k++){
                    if(matrix[k][m]>min){
                        lucky = false;
                    break;
                       
                    }
                 
                } 
                 if (lucky) {
                arr.add(min);
            }
            
        }
        
    
    return arr;
    }
}