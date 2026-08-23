class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder();
      for(int i =0;i<s.length();i++){
          int ch = s.charAt(i);
          int ascii = (int) ch;
          String binaryStr = Integer.toBinaryString(ascii);
          String paddedB = String.format("%8s",binaryStr).replace(' ','0');
          sb.append(paddedB);
          
      }
        int l =0;
        int r= sb.length()-1;
        while(l<r){
            char bit1 = sb.charAt(l);
            char bit2 = sb.charAt(r);
            if(bit1!=bit2){
                 return false;
                
            }else{ 
               l++;
                r--;
            
            } 
        }
       return true; 
    }
}