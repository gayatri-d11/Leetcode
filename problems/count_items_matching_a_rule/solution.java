class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
                  int count=0;
                  int k=0;
                  if(ruleKey.equals("type")) k=0;
                  if(ruleKey.equals("color")) k=1;
                  if(ruleKey.equals("name")) k=2;
                  for(int i =0;i<items.size();i++){
                    if(ruleValue.equals(items.get(i).get(k))){
                        count++;
                    }
                  }
                  return count;
        
        
    }
}