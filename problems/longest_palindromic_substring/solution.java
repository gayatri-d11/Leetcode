class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()<1){
            return "";
        }
        String maxlen=s.substring(0,1);
        for(int i=0;i<s.length();i++){

        
        String k = expandfromcenter(s,i,i);
        String j = expandfromcenter(s,i,i+1);

        if(k.length()>maxlen.length()){
            maxlen = k;
        }
         if(j.length()>maxlen.length()){
            maxlen = j;
        }
    }
       return maxlen; 
    }
    private String expandfromcenter(String s, int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
    l--;
    r++;
 }
      return s.substring(l+1,r);
    }
}