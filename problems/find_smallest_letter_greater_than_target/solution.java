class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int i =0;
        int j =letters.length-1;
   if(target>=letters[letters.length-1] || target<letters[0]){
         return letters[0];
   }
        while(i<=j){
            int mid = (i+j)/2;
            

            if(letters[mid]>target){
                j=mid-1;
            
            }
            if(letters[mid]<=target){
                i=mid+1;
            }
        }
        

        return letters[i];
    }
}