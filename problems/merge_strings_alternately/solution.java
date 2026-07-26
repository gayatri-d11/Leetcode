class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int p =0;
        int q =0;
        
        while(p<word1.length() && q<word2.length()){
            sb.append(word1.charAt(p));
             sb.append(word2.charAt(q));
             p++;
             q++;
        }
        if(p==word1.length()){
        sb.append(word2.substring(q,word2.length()));
        }
         if(q==word2.length()){
        sb.append(word1.substring(p,word1.length()));
        }
        return sb.toString();
    }
}