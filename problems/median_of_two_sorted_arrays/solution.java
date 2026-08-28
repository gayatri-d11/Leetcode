class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=0;
        while(j<nums2.length && i<nums1.length){
            if(nums1[i]<=nums2[j]){
                merged[k]=nums1[i];
                k++;
                i++;
            }else{
               merged[k]=nums2[j];
                k++;
                j++; 
            }
        }
        while(i<nums1.length){
          merged[k]=nums1[i];
                k++;
                i++;  
        }
        while(j<nums2.length){
          merged[k]=nums2[j];
                k++;
                j++;  
        }
       int mid = merged.length/2;
       double ans =0.0;
       if(merged.length%2==0){
        ans = (merged[mid]+merged[mid-1])/2.0;
       }else{
        ans=merged[mid];
       }
       return ans;
    }
}