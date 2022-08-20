class Solution {
    public ListNode reverseList(ListNode head) {
     ListNode run=head;
     ListNode prev=null;
        if(head==null){
            return head;
        }else{
            while(run!=null){
                ListNode temp=run.next;
                run.next=prev;
                prev=run;
                run=temp;
            }
        }
        return prev;
    }
}
