//remove a said element from the linkedlist will take you to a journey of reaching the element with a prev point following a curr one!!!
//we have curr pointing to head
//another pointer called prev pointer whose next points to curr
//iterate until curr is not null
//return head
//initialize Listnode curr=head, sentinel=new Listnode(0), prev.next=sentinel;
//this type of problems need three additional pointers; curr,prev,and sentinel
while(curr!=null){ //to avoid null pointer exce and also to check if we have reched the end of list
  if(crr.val==target){
    prev.next=curr.next;
  }
  prev.next=curr
  curr=curr.next;
  
}
return sentinel.next;
