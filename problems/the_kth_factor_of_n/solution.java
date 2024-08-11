class Solution {
    public int kthFactor(int n, int k) {
       int count =0;
       for(int  i = 1;i<=n;i++){
        if(n%i==0){

           count++;
       }
       
       if(count==k){
        return i;
       }

     }
      return -1;



}
public void main (String[]args){
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    kthFactor(n,k);
}
}