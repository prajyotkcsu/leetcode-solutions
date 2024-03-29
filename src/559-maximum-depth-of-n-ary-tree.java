class Solution {
    public int maxDepth(Node root) {
    if(root == null) return 0;
    Queue<Node> queue = new LinkedList<>();
    queue.offer(root);
    int depth = 0;
    while(!queue.isEmpty()){
        int size = queue.size();
        for(int i = 0; i < size; i++){
            Node current = queue.poll();
            for(Node child: current.children) queue.offer(child);
        }
        depth++;
    }
    return depth;
}
}

##dfs 
class Solution {
    public int maxDepth(Node root) {
        if (root == null) return 0;
        
        Stack<Pair<Node, Integer>> stack = new Stack<>();
        stack.push(new Pair<>(root, 1));
        int maxDepth = 0;
        
        while (!stack.isEmpty()) {
            Pair<Node, Integer> pair = stack.pop();
            Node node = pair.getKey();
            int depth = pair.getValue();
            
            maxDepth = Math.max(maxDepth, depth);
            
            for (Node child : node.children) {
                System.out.println(child.val);
                stack.push(new Pair<>(child, depth + 1));
            }
        }
        
        return maxDepth;
    }
}
