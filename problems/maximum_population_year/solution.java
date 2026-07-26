class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] year = new int[101];

        for(int[] log : logs){
            year[log[0]-1950]++;
            year[log[1]-1950]--;
        }
        int max=0,population=0,result=0;

        for(int i=0;i<101;i++){
            population+=year[i];
            if(population>max){
                max=population;
                result =i;
            }
        }
        return result + 1950;
    }
}