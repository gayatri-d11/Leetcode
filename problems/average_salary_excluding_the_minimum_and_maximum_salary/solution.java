class Solution {
    public double average(int[] salary) {
      int min=Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      
        double sum =0;
       for(int i=0;i<=salary.length-1;i++){
        if(salary[i]<min){
            min=salary[i];
        }
        if(salary[i]>max){
            max=salary[i];
        }
          sum+=salary[i];
         
       } 
       
       return (sum-(min+max))/(salary.length-2);
    }
}