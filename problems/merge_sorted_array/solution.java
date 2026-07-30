class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = nums1.clone();
        int p=0;
        int q=0;
        int k=0;
        while(p<m && q<n){
            if(nums2[q]<=nums[p]){
                nums1[k]=nums2[q];
                q++;
                k++;
            }else{
                 nums1[k]=nums[p];
                p++;
                k++;
            }
        }
        while(q<n){
            nums1[k]=nums2[q];
                q++;k++;
        }
         while(p<m){
            nums1[k]=nums[p];
                p++;k++;
        }
    }
}