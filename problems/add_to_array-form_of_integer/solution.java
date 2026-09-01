class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer>ans = new ArrayList<>();
        int j = num.length-1;
        int a=0;
    while(j>=0 || k>0){
        if(j>=0){
             k +=num[j];
              j--;
        }
     
        ans.add(k%10);
       
        k/=10;
       

    }
    return ans.reversed();
    }
}