class Solution {
    public boolean isPowerOfTwo1(int n, int i , int ans){
     
     if(ans>n || ans<=0){
            return false;
        }
        else if(ans==n){
            return true;
        }else{

        
        return isPowerOfTwo1( n,i+1,ans*2);
        }
    
    }
    public boolean isPowerOfTwo(int n) {
        boolean istrue = isPowerOfTwo1( n,0,1);
        return istrue;
        
    }
}