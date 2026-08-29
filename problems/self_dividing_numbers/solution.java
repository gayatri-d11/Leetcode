class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new LinkedList<>();
        for(int i=left;i<=right;i++){
        
            if(dividingNumber(i)!=0){
                 list.add(i);
            }
        }
        return list;
    }
    public int dividingNumber(int n){
        int m=n;
        while(n>=1){
            int k =n%10;
            if(k!=0 && m%k==0){
                n=n/10;
            }else{
                return 0;
            }
          
        }
       return m;

    }
}