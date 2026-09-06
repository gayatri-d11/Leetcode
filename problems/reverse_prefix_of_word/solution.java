class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int idx =0;
        for(int i=0;i<word.length();i++){
            sb.append(word.charAt(i));
            if(word.charAt(i)==ch){
                idx = i;
                break;
            }

        }
        if(idx==0){
            return word;
        }
        sb=sb.reverse();
         for(int i=idx+1;i<word.length();i++){
            
            sb.append(word.charAt(i));
        }

        return sb.toString();
    }
}