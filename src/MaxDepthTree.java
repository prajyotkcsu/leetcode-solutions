//Hi, this problem outline the fastest method to calculate distance between root node and the farthest leaf node in a binary tree, tree having no more than two children
class Solution {
    public int maxDepth(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();
        Stack<Integer> distanceStack=new Stack<>();
        if(root==null){
            return 0;
        }
        stack.push(root);
        distanceStack.push(1);
        int maxDistance =0;
        while(!stack.isEmpty()){
            TreeNode curr=stack.pop();
            int distance=distanceStack.pop();
            if(curr.left==null && curr.right==null){
                System.out.println("leaf node found"+curr.val);
            }
            if(curr.right!=null){
                stack.push(curr.right);
                distanceStack.push(distance+1);
            }if(curr.left!=null){
                stack.push(curr.left);
                distanceStack.push(distance+1);
            }
            
            maxDistance=Math.max(maxDistance,distance);
        }
        System.out.println("maxDistance"+maxDistance);
        return maxDistance;
    }
}

//I'm used iterative process to fill and empty stack as I traverse the tree and it's nodes, as I do it for each level, I'm incrementing the depth local var by one(also push pop from the stack, that way I have the most recent depth)
//on each iteration I'm recommuting maxdepth global var.


class TreeNode{
  
} 
public main(){
  //code to populate the tree with nodes.
  //tree: [1,null,3,4,5,null,null,null,6,null,7]
}
