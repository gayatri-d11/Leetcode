class Solution {
    public int smallestNumber(int n, int t) {
        int m =n;
    while(true){
        if(digitProduct(m)%t==0){
          return m;
        }
        m++;
    }
    }
    public int digitProduct(int n){    
        int product = 1;
    while(n>0){
        int k =n%10;
        product*=k;
        n/=10;

    }
    return product;
    }

   

}