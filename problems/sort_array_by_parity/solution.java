class Solution {
    public int[] sortArrayByParity(int[] nums) {
       
        int odd=0;
        int i =0;
        while(i<nums.length){
            if(nums[i]%2==0){
                int temp=nums[odd];
                nums[odd]=nums[i];
                nums[i]=temp;
                odd++;
                
             }
             i++;
        }
        return nums;
    }
}