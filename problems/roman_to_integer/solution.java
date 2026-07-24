class Solution {
    public int romanToInt(String s) {
     int num =0;int j=0;
     for(int i=s.length()-1;i>=0;i--){
        int k=0;
        switch(s.charAt(i)){
            case 'I':
            k=1;
            break;
            case 'V':
            k=5;
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
            case 'X':
            k=10;
            break;
            
        }
        

        if(j>k){
            num-=k;

        }else{
            num+=k;
        }
        j=k;
     
     }
     return num;
    }
}