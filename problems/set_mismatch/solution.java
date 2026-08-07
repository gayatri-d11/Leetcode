class Solution {
    public int[] findErrorNums(int[] nums) {
        ArrayList<Integer>arr = new ArrayList<>();
     HashSet<Integer>set = new HashSet<>();
     int n =nums.length;
     int ans = (n*(n+1))/2;
     int sum =0;
     for(int i =0;i<n;i++){
        if(!set.contains(nums[i])){
            set.add(nums[i]);
            sum+=nums[i];
        }else{
            arr.add(nums[i]);

        }
     }
     ans = ans-sum;
     arr.add(ans);
     int idx =0;
   int[] re = new int[arr.size()];
     for(int i : arr){
           re[idx]=i;
           idx++;
     }

     return re;
    }
}