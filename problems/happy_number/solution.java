class Solution {
    public boolean isHappy(int n) {
        if(n==1){
            return true;

        }
        if (n == 4) {
            return false;
        }
        
        int ans=0;
        while(n>0){
            ans += (n%10)*(n%10);
            n/=10;
        }
        
        return isHappy(ans);
    }
}