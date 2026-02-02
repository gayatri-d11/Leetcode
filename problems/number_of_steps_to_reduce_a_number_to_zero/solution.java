class Solution {
    public int numberOfSteps(int num) {
        return ans(num,0);
    }
    static int ans(int num , int count) {
        if(num==0){
        return count;
       }
      
       if(num%2==0){
        num=num/2;
        count++;
       }else{
        num=num-1;
        count++;
       
       }
       return ans(num,count);
    }
    }
      
