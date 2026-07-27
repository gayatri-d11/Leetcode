class Solution {
    public void reversearray(int[] nums ,int i,int j){
        if(i>j){
            return;
        }
         int temp = nums[i];
         nums[i]=nums[j];
         nums[j]=temp;
         i++;
         j--;
     reversearray(nums,i,j);



    }
    public void rotate(int[] nums, int k) {
        if(nums.length<=1)return ;
        if(k>nums.length){
            k%=nums.length;
        }
        reversearray(nums,0,nums.length-1);
         reversearray(nums,0,k-1);

 reversearray(nums,k,nums.length-1);


        
    }
}