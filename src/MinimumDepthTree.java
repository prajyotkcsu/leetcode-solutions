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
//This problem essentially asks you distance between root node and first leaf node that has got zero children, meaning node.left and node.right are null----return depth;
class Solution {
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        Queue<TreeNode> queue= new LinkedList<>();
        int level=1;
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int size=queue.size(); //this way performing actions on each child of a node, if node doesn't have any child terminate it with previous return
            for(int i=1;i<=size;i++)
            {
                TreeNode curr=queue.poll();
                if(curr.left==null && curr.right==null) //leaf node found
                    return level;
                if(curr.left!=null)
                {
                    queue.offer(curr.left);
                }
                if(curr.right!=null)
                {
                    queue.offer(curr.right);
                }
            }
            level++; //leaf node not found
        }
      return level;  
    }
}
