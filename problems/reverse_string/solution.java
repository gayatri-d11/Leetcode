class Solution {
    public void reverseString(char[] s) {
        reverseString1(s, 0, s.length-1);
    }
    public void reverseString1(char[]s,int p,int q){
        if(p>q){
           return;
        }
           
    char temp = s[p];
    s[p]=s[q];
    s[q]=temp;
    p++;
    q--;
    reverseString1(s,p,q);
    


    }
    }
