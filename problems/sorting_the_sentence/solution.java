class Solution {
    public String sortSentence(String s) {
        String[] str= s.split(" ");
        String[] result = new String[str.length];
   for(String i: str){
      int index = i.charAt((i.length()-1))-'0';

      result[index-1]= i.substring(0,i.length()-1);
   }
       
      return String.join(" ", result);
    }
}