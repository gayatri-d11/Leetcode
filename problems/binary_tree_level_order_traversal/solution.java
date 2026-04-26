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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
        if (root==null) return result;
      
       Queue<TreeNode>Que = new LinkedList<>();
        Que.offer(root);
        while(!Que.isEmpty()){
            int level = Que.size();
            List<Integer>currlevel = new ArrayList<>();
            for(int i=0;i<level;i++){
             TreeNode curr = Que.poll();
             currlevel.add(curr.val);

        if(curr.left != null){
        Que.offer(curr.left);
     }
     if(curr.right != null){
        Que.offer(curr.right);
     }
            }
     result.add(currlevel);
     
        }
     return result;
    }
}