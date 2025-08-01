class Solution {
    public double trimMean(int[] arr) {
        int n = arr.length;
        int FivePersent  =(int)(0.05*n);
        Arrays.sort(arr);
        Double sum=0.0;

        for(int i = FivePersent;i<n-FivePersent;i++){
         sum+=arr[i];
        }

        return sum/(n-2*(FivePersent));

    }
}