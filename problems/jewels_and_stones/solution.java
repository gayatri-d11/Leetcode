class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int[] freq = new int[128];

        for(int i=0;i<jewels.length();i++){
           freq[jewels.charAt(i)]++;
        }
        int c=0;
        for(int i =0;i<stones.length();i++){
            c+=freq[stones.charAt(i)];
        }
        return c;
    }
}