class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idx =0;
        int count=0;
        if(ruleKey.equals("color") ) idx=1;
        if(ruleKey.equals("name") ) idx =2;
        for(List<String> i : items){
            if(i.get(idx).equals(ruleValue)){
                count++;
            }
        }
return count;
    }
}