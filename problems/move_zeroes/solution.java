class Solution {
    public void moveZeroes(int[] nums) {
       int n =nums.length;
       
       int j=0;//here j tracks the index of lastnonzero appered
       for(int i =0;i<n;i++){
        if (nums[i]!=0){//if number is nonzero
            nums[j]=nums[i];//assign the no. next to lastnonzero no.
            j++;//ready to store next nonzero
        }
       }
        for(int k=j;k<n;k++){
            nums[k]=0;//akl zeros to end
        }
       }

    }


//time complexity :O(N)
//Space complexity:O(1)