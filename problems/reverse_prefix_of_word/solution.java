class Solution {
    public String reversePrefix(String word, char ch) {
        int idx=0;
        for(int i =0;i<word.length();i++){
            if(word.charAt(i)==ch){
                idx=i;
                break;
            }else if(word.charAt(i)!=ch && i==word.length()-1){
                return word;
                
            }

        }
        //cant manupulate string 
        char []arr = word.toCharArray();
        int i=0;int j=idx;
        while(i<j){
        char temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
        }

        
 return new String(arr);
    }
}