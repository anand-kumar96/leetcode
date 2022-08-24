/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
   // for this we need two node so that we can get d next 
//and d next next node
//2 - > 3 - > 4 - > 5  // D-->3
ListNode nextNode=null;
nextNode=node.next; // nextNode-->4
ListNode temp=nextNode.next; // temp-->5
 node.val=nextNode.val; //node-->4
 node.next=temp;//node.next->5 i.e 3 is deleted means D become next

}
}
