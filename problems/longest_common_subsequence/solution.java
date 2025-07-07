class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
       int n1= text1.length();
       
       boolean isvalid= true;
       for(int i = 0 ; i < n1; i++){
        if(text1.charAt(i)<'a'|| text1.charAt(i)>'z'){
            isvalid =false;
            break;
        }

       }
       
        
     int n2= text2.length();
      for(int j = 0 ; j < n2; j++){
         if(text2.charAt(j)<'a'|| text2.charAt(j)>'z'){
            isvalid = false;
            break;
         }
       }
   
  if(!isvalid){
    return 0;
  }
  

   int [][] dp = new int[n1+1][n2+1];
    
        for(int i = 1; i<=n1 ; i++){
            for(int j = 1; j<=n2 ; j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                 dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
        
                }

            }
            
        
   return dp[n1][n2];
    }

    }
