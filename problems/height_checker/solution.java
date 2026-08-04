class Solution {
    public int heightChecker(int[] heights) {
      int[] h = Arrays.copyOf(heights,heights.length);  
      Arrays.sort(heights); 
      int count=0;
      for(int i=0;i<heights.length;i++){
        if(h[i]!=heights[i]){
            count++;
        }
      }
return count;
    }
}