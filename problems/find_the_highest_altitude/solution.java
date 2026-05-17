class Solution {
    public int largestAltitude(int[] gain) {
        int[] ans = new int[gain.length+1];

    ans[0]=0;
    int prev=0;
    int max=0;
    for(int i =1;i<ans.length;i++){
     ans[i]=gain[i-1]+prev;
     prev=ans[i];
    }

     for(int i =0;i<ans.length;i++){
      if(ans[i]>max){
        max=ans[i];
      }
 
         }
      return max;

}}