class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> ans = new LinkedList<>();
         int maxcandy=0;
        for(int i = 0;i<candies.length;i++){
          if(maxcandy <candies[i]){
            maxcandy = candies[i];
          }
        }

         for(int j= 0;j<candies.length;j++){

            if(candies[j]+extraCandies>=maxcandy){
            ans.add(true);
        }else{
            ans.add(false);
        }
         }
         return ans;
        
    }
}