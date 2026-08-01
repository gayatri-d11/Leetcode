class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    
        ArrayList<Integer>arr = new ArrayList<>();
          ArrayList<Integer>set = new ArrayList<>(); 
        for(int i :nums1){
            set.add(i);
        } 
        for(int i:nums2){
            if(set.contains(i)){
                arr.add(i);
                set.remove(Integer.valueOf(i));
            }
        }
        int[] result = new int[arr.size()];
        for(int i=0 ;i<arr.size();i++){
            result[i]=arr.get(i);
        }
        return result;
      
    }
}