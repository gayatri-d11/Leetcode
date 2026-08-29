class Solution {
    public boolean validDigit(int n, int x) {
        int a=n;
        boolean contain =false;
      
        while(n>0){
            if(n%10 == x){
                contain =true;
                
            }
            if(n/10==0 && n!=x && contain){
                return true;
            }
        
            n/=10;

        }
       
        return false;
    }
}