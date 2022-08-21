class Solution {
    public ListNode addTwoNumbers(ListNode first, ListNode second) {
ListNode dummy=new ListNode(-1);
ListNode curr=dummy;
int sum=0;
int carry=0;
while(first!=null || second!=null){
    int x=(first!=null)?first.val:0;
    int y=(second!=null)?second.val:0;
    sum=carry+x+y;
    carry=sum/10;
    curr.next=new ListNode(sum%10);
    curr=curr.next;
    if(first!=null)first=first.next;
    if(second!=null) second=second.next;
    }
    // if any carry
    if(carry>0){
    ListNode temp=new ListNode(carry);
    curr.next=temp;
    curr=temp;
}
return dummy.next;
  }
}
