public class ListNode{
  int val;
  ListNode next=next;
  ListNode(int val){
    this.val=val;
  }

  public ListNode middle(ListNode head){
    ListNode slow=head;
    ListNode fast=head;
    while(fast!=null && fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
  }
    //fast reached end of list
    return slow; //slow is in the middle.

}
