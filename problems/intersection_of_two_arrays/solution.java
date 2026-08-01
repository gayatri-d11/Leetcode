class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer>arr = new ArrayList<>();
        HashSet<Integer>set = new HashSet<>();
        for(int i :nums1){
            set.add(i);
        } 
        for(int i:nums2){
            if(set.contains(i)){
                set.remove(i);
                arr.add(i);
            }
        }
        int[] result = new int[arr.size()];
        for(int i=0 ;i<arr.size();i++){
            result[i]=arr.get(i);
        }
        return result;
      
    }
}