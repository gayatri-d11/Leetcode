class Solution {
    public int strStr(String haystack, String needle) {
        boolean hasneedle = haystack.contains(needle);
        if(hasneedle){
            int index = haystack.indexOf(needle);
            return index;
        }
        return -1;
    }
}