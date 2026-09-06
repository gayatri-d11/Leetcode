class Solution {
    public int romanToInt(String s) {
        int j=0;
        int sum=0;
        for(int i =s.length()-1;i>=0;i--){
            int k=0;
           switch(s.charAt(i)){
            case 'I':
              k=1;
              break;
            case 'V':
              k=5;
              break;
            case 'X':
              k=10;
              break;
            case 'L':
              k=50;
              break;
            case 'C':
              k=100;
              break;
            case 'D':
              k=500;
              break;
            case 'M':
              k=1000;
              break;
           }
           if(k<j){
              sum-=k;
           }else{
              sum+=k;
           }
           j=k;
           }
            
        
        return sum;
    }
}