class Solution {
  
    public boolean ispalindrom(String sub){
        int i =0;
        int j=sub.length()-1;
        while(i<j){
            if(sub.charAt(i)!=sub.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public int countSubstrings(String s) {

        int count=0;
       
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
        if(ispalindrom(s.substring(i,j+1))){
               count++;
        }
            }
        }
        return count+s.length();
    }
}