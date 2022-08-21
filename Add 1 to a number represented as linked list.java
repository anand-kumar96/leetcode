/*
class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        next = null;
    }
}
*/
//Add 1 to a number represented as linked list - Single Linked List 
static Node addOne(Node head){
boolean flag=true;
Node run=head;
while(flag==true && run!=null){
// if last node is 9 then put last node val=1 , and a node 0 to head   
   if(run.next==null && run.data==9){  
       run.data=1;
       Node temp=new Node(0);
       temp.next=head;
       head=temp;
       run=run.next;
       // if head==9 then put it to 0
   }else if(run.data==9){
       run.data=0;
       run=run.next;
       // next pointer value is not 9 thn add 1 and break or say false
    }else if(run.data!=9){
        run.data=run.data+1;
        flag=false;
    }
    }
return head;
}
