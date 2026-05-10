class Solution {
    public int numIdenticalPairs(int[] nums) {
          int count =0;
          
        for(int i = 0;i<nums.length;i++){
           int p =i+1;
           while(p<nums.length){
                if(nums[i]==nums[p]){
                    count++;
                }
                p++;
                     }}
        return count;
    }
}