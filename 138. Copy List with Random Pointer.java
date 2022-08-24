/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) { 
   Node curr=head;
while(curr!=null){
    Node temp=curr.next;
    curr.next=new Node(curr.val);
    curr.next.next=temp;
    curr=temp;
}
curr=head;
while(curr!=null){
    curr.next.random=(curr.random!=null)?curr.random.next:curr.random;
    curr=curr.next.next;
}
Node original=head;
Node copy=null;
if(head!=null){
copy=head.next;
}
Node temp=copy;
while(original!=null && copy!=null){
    original.next=original.next.next;
    copy.next=(copy.next!=null)?copy.next.next:copy.next;
    original=original.next;
    copy=copy.next;
}
return temp;
}
}
