class Solution {
    public boolean isHappy(int n) {
       int slow = n;
       int fast=n;
      do {
            slow = findsquare(slow);                 // move 1 step
            fast = findsquare(findsquare(fast));    // move 2 steps
        } while (slow != fast);
        // this do-while because both are intialized at n, if used while then loop will not run
       if(slow==1){
        return true;
       }
      return false;
    }  
       
    private int findsquare(int num){
         int sum = 0;
         while(num!=0){
           int k =num%10;
            num=num/10;
            sum=sum+ k*k;

        }
        return sum;
       }
     
    
    }
    
