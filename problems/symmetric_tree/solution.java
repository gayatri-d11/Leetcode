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
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root.left);
        q.add(root.right); 

        while(!q.isEmpty()){
         TreeNode one = q.poll();
         TreeNode two = q.poll();

        

         if(one == null && two==null){
            continue;
         }
         if(one ==null || two ==null){
            return false ;
         }
          if(one.val != two.val){
          return false;
         }

         q.add(one.left);
         q.add(two.right);
         q.add(one.right);
         q.add(two.left);


        } 
        return true;       
    }
}