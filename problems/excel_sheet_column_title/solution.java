class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
         int n = columnNumber;
        while(n>0){
      n--;// to adjust for 1 based indexing that is a=1
       int remain = n%26;//remainder to find current character
       char c = (char)('A'+remain);
       sb.append(c);//appen from right to left 

       n/=26;//move to next place value
    }
    return sb.reverse().toString();
    }
}