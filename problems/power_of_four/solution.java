class Solution {
    public boolean isPowerOfFour1(int n,int i ,int ans){
        if(ans>n|| ans<=0){
            return false;
        }else if(ans==n){
            return true;
        }else{
           return  isPowerOfFour1(n,i+1,ans*4);
        }

    }
    public boolean isPowerOfFour(int n) {
        return isPowerOfFour1(n,0,1);
     
}
}