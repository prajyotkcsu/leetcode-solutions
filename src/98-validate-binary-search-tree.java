class Solution {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();
        TreeNode prev=null;
        TreeNode curr=root;
        while(curr!=null || stack.size()>0){
            while(curr!=null){ //reach left-most node until leaf is found
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.pop(); //root node, left node, left node
            if(prev!=null && curr.val<=prev.val) return false; //compare left and right
            prev=curr;
            curr=curr.right; //reach right-most node until leaf is found

        }
        return true;
}
}
