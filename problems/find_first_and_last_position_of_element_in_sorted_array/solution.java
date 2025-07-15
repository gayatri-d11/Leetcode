class Solution {
    int firstbound( int[] nums, int target){
        int n = nums.length;
        int left =0;
        int right =n-1;
        int ans = n;
        int mid = -1;
        while(left<=right){
          mid = (left + right)/2;
            if(nums[mid]>=target){
                right=mid-1;
                 ans = mid;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }

    int Secondbound( int[] nums, int target){
        int n = nums.length;
        int left =0;
        int right =n-1;
        int ans = n;
        int mid = -1;
        while(left<=right){
            mid = (left + right)/2;

            if(nums[mid]<=target){
                left=mid+1;
            }else{
                ans = mid;
               right=mid-1; 
            }
        }
        return ans;

    }
public int[] searchRange(int[] nums, int target) {

        int first = firstbound( nums,target);
        int second = Secondbound( nums, target);
        if( first == nums.length||nums[first]!=target){
            return new int[]{-1,-1};
        }
        return new int[]{first,second-1};


    }
}