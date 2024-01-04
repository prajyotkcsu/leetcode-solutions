//ways to traverse a binary tree
//bfs use queue
if root==null
  return;
queue.add(curr)
  while(!queue.isEmpty()){
  Node curr=queue.poll();
  System.out.println(curr.val);
  if(curr!=null){
    queue.add(curr.left);
    queue.add(curr.right);
  }
  }
