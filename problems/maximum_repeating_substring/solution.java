class Solution {
    public int maxRepeating(String sequence, String word) {
      
          int count =0;
          String i = word;
       while(sequence.contains(i)){
         count++;
          i+=word;
       }
        return count;

    }
}