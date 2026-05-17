class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
      
        for(int p[]:image){
             int i = 0;
             int j= p.length-1;
             while(i<=j){
                int k = p[j];
                if(p[i]==0){
                    p[j]=1;
                }else{
                    p[j]=0;
                }
                if(k==0){
                    p[i]=1;
                }else{
                    p[i]=0;
                }
                i++;
                j--;

             }

     }
return image;
    }
}