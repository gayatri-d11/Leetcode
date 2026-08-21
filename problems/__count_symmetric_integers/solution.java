class Solution {
    public int countSymmetricIntegers(int low, int high) {
          int count=0;
        for(int i=low;i<=high;i++){
            int m=i;
             int sum =0;
            int k=(int)Math.log10(i)+1;
            if(k%2==1){
                continue;

            }
            for(int j=k;j>=1;j--){
               
                   if(j>k/2){
                     sum+=m%10;
                     m/=10;
                   }else{
                    sum-=m%10;
                    m/=10;
                   }
                   
            }
            if(sum==0){
                    count++;
                   }
            
        }
      return count;
        
    }
}