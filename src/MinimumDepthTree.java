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

 //DFS recursive approach
class Solution {

public int minDepth(TreeNode root) {
    if(root==null){
return 0;
    }
    Queue<TreeNode> q=new LinkedList<>();
    q.add(root);
    int depth=1;
    int minDepth=Integer.MAX_VALUE;
    while(!q.isEmpty()){
        TreeNode curr=q.poll();
        if(curr.left==null && curr.right==null){
            minDepth=Math.min(minDepth,depth);
        }
        if(curr.left!=null){
            q.add(curr.left);
        }
        if(curr.right!=null){
            q.add(curr.right);
        }
        depth++;
    }

return minDepth;}

}
