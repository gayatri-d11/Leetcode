class Solution {
    public boolean isPowerOfThree1(int n,int i , int ans){
        if(ans>n||ans<=0){
            return false;
        }else if(ans==n){
            return true;
        }else{
            return isPowerOfThree1(n,i+1,ans*3);
        }

    }
    public boolean isPowerOfThree(int n) {
        return isPowerOfThree1(n,0,1);
        
    }
}