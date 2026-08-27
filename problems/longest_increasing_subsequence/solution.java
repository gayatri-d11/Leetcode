class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] tails = new int[nums.length];
        int size = 0; 

        for (int num : nums) {
           
            int i = 0, j = size;
            while (i < j) {
                int mid = (i + j) / 2;
                if (tails[mid] < num) {
                    i = mid + 1; // Move right
                } else {
                    j = mid;     // Move left
                }
            }
            
            tails[i] = num; // Replace or extend
            if (i == size) {
                size++; // Found a larger element, expand LIS length
            }
        }

        return size;
    }
}