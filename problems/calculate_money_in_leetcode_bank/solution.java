class Solution {
    public int totalMoney(int n) {
     int monday=1;
     int current =1;
     int sum =0;

     for(int i = 1; i<=n;i++){
       sum +=current;
       current++;

       if(i%7==0){
        monday++;
        current=monday;
       }
     }

     return sum;   
    
    }
}