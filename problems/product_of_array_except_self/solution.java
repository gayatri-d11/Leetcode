class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] left =new int[n];
        int leftproduct =1;
        for(int i =0;i<n;i++){
              leftproduct*=nums[i];
              left[i]= leftproduct;

        }
        int[] right =new int[n];
        int rightproduct =1;
        for(int j =n-1;j>=0;j--){
              rightproduct*=nums[j];
            right[j]= rightproduct;

        }
         int[] result =new int[n];
        for(int i =0;i<n;i++){
            if(i==0){
                   result[i]=right[i+1];
            }
            else if(i==n-1){
                   result[i]=left[i-1];
            }else{
              result[i]=left[i-1]*right[i+1];
            }
        }
        return result;
    }
}