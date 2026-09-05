class Solution {
    public int totalMoney(int n) {
        int mon = 1;
        int curr = 1;
        int sum =0;

        for(int i =1;i<=n;i++){
            sum+=curr++;
            if(i%7==0){
                mon++;
                curr=mon;
            }
        }
        return sum;
    }
}