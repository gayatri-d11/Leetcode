class Solution {
    public String reverseWords(String s) {
      String[] str = s.split(" ");
      for(int i =0 ;i<str.length;i++){
        StringBuilder sb = new StringBuilder(str[i]);
        str[i]= sb.reverse().toString();
      } 
    
       return String.join(" ",str);
    }
}
//logic :
//as we cant change the string in the array :str[]
//we create a container ,variable called sb , take a string word from str array and reversed it (changed the order) convert into string again 
//finally join all the str array elemnts got the answer