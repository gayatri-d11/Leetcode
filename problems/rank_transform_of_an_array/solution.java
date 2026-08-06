class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        Map<Integer,Integer>rankMap = new HashMap<>();
        int rank =1;
        for(int s : sorted){
            if(!rankMap.containsKey(s)){
                rankMap.put(s,rank++);
            }
        }

        int[] ans = new int[arr.length];
        for(int i =0;i<arr.length;i++){
            ans[i]=rankMap.get(arr[i]);
        }
        return ans;
    }
}