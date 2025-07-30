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
     public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer>r1=new ArrayList<>();
         List<Integer>r2=new ArrayList<>();
         leafNode1(root1,r1);
         leafNode2(root2,r2);
         return (r1).equals(r2);
    }
     public List<Integer> leafNode1(TreeNode root1,List<Integer>r1){
        
        if(root1==null) {
            return new ArrayList<>();
            }

       if(root1.left ==null && root1.right==null){
        r1.add(root1.val);
        
       }
       leafNode1(root1.left,r1) ;
       leafNode1(root1.right,r1) ;
       return r1;

    }

     public List<Integer> leafNode2(TreeNode root2,List<Integer>r2){

        
        if(root2==null) {
            return new ArrayList<>();
            }
        if(root2.left ==null && root2.right==null){
        r2.add(root2.val);
       }
       leafNode2(root2.left,r2) ;
       leafNode2(root2.right,r2) ;
       return r2;
    }








}