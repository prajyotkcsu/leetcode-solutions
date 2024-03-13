class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        TreeNode curr=root;
        while(curr!=null || !stack.isEmpty()){ //do this until there are still nodes in the stack.
            while(curr!=null){
              //do a dfs operation on left side of the tree while storing the node on to the stack. top-bottom
                stack.push(curr); 
                curr=curr.left; 
            }
            //empty the stack and access the tree from bottom-up while accessing the right node.
            curr=stack.pop();
            res.add(curr.val);
            curr=curr.right; 
        }
        return res;
    }
}
