class Solution {
    public int[] rotate(int[] arr, int k) {
      int n = arr.length;
      if(n==1) return new int[0];
      if(k==0)return arr;
       k=k%n;
       reverse( arr,  0 ,  n-1  );
       reverse( arr, 0 ,  k-1  );
       reverse( arr,  k ,  n-1  );
        return arr;
    }

    public void reverse(int[] arr, int start , int end  ){
        while(start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
     


    }
