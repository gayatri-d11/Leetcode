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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new  ArrayList<>();
        Queue<TreeNode>q= new LinkedList<>();
        if(root==null){
            return result;
        }
        q.offer(root);
         boolean lefttoright=true;
        while(!q.isEmpty()){
               List<Integer>li =new ArrayList<>();
         int level = q.size();

         for(int i =0;i<level;i++){
            TreeNode curr =q.poll();

          if(curr.left!=null){
                q.offer(curr.left);
            }
             if(curr.right!=null){
                q.offer(curr.right);
            }
            
if(lefttoright){
    li.add(curr.val);
}else{
    li.add(0,curr.val);
}
  

         }
         lefttoright =!lefttoright;
         result.add(li);
        
        }
        return result;

    }
}