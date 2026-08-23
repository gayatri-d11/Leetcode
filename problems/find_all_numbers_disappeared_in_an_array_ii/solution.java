class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
          List<List<Integer>> list = new ArrayList<>();
        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
       List<Integer>list2= new ArrayList<>();
        for(int i =lower;i<=upper;i++){
            
            if(set.contains(i)){
                continue;
            }else{
              list2.add(i);
            }
            
        }
       
           int j=0;
          while(j<list2.size()){
              int start = list2.get(j);
              while(j+1 < list2.size() && list2.get(j+1)==list2.get(j)+1){
                 j++;
                      }
              int end = list2.get(j);
              list.add(Arrays.asList(start,end));
                  j++;
          }
        
        return list;
    }
}