/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
         TreeNode A = root.left;
         TreeNode B = root.right;
         
        return checkLeftRight( A,B) ;
    }
    public Boolean checkLeftRight(TreeNode A,TreeNode B)   {

    if(A==null && B==null) return true;
    if(A==null || B==null){

     return false;
    }
    
      return (A.val==B.val)
                 && checkLeftRight(A.left,B.right) 
                && checkLeftRight(A.right,B.left) ;
       
       

    }
    
}