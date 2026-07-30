class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int k=n/2;
        for(int i =0;i<n;i++){
            if(n%2==0 && k==0){
                k--;
            }
            arr[i]=k;
            k--;

        }
        return arr;
    }
}