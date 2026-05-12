class Solution {
    public String sortSentence(String s) {
      
      String[] word= s.split(" ");
      String[] ans = new String[word.length];
      for(int i = 0;i<word.length;i++){
    int index =  word[i].charAt(word[i].length()-1)-'0';    
      for(int j =0;j<word.length;j++){
        ans[index-1] = word[i].substring(0,word[i].length()-1);            
       }
     }
      return String.join(" ",ans);
  }
}
