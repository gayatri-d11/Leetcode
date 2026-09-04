class Solution {
    public String[] largestString(int[] nums) {
       String[] ans = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            int  x = nums[i];

            int[] counts = new int[26];

            for(int k =0;k<25;k++){
            counts[k] =x%2;
            x=x/2;
            }
            counts[25]= x;

            StringBuilder sb = new StringBuilder();

             for(int j =25;j>=0;j--){
            char ch = (char) ('a'+j);
            for(int c =0;c<counts[j];c++){
                sb.append(ch);
            }
            ans[i]= sb.toString();
            }
        }
        return ans;
    }
}