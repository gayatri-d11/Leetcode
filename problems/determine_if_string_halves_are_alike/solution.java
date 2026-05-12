class Solution {
    public boolean halvesAreAlike(String s) {
       int n = s.length();
        int CA=0;
        int CB=0;
        int p =0;
        int q = n/2;
       while(p<n && q<n){
        if(isVowel(s.charAt(p))) CA++;
        if(isVowel(s.charAt(q))) CB++;
          p++;
          q++;
       }
        return CA==CB;
    }

    boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
     return false;
    }
}