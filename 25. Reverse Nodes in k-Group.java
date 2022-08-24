/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr=head;
        ListNode prev=null;
        int count=0;
        while(curr!=null && count<k){
          ListNode temp=curr.next;
          curr.next=prev;
            prev=curr;
            curr=temp;
            count++;
        }
        ListNode dummy=curr;
        count=0;
        while(curr!=null){
            curr=curr.next;
            count++;
//             if(count>=k){
//                 break;
//             }
        }
        curr=dummy;
        if(head!=null && count>k-1){
            head.next=reverseKGroup(curr,k);
        }else{
            head.next=dummy;
             while(dummy!=null){
             dummy=dummy.next;
        }
        }
        return prev;
    }
}

// method 02
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
     public int countList(ListNode head, int k) {
         int count=0;
         ListNode run=head;
         while(run!=null){
             run=run.next;
             count++;
         }
         return count;
     }
    public ListNode reverseKGroup(ListNode head, int k){
        int count=countList(head,k);
        int n=count/k;
        ListNode curr=head;
        ListNode prev=null;
        int counts=0;
        while(curr!=null && counts<k){
          ListNode temp=curr.next;
          curr.next=prev;
            prev=curr;
            curr=temp;
            counts++;
        }
        int p=1;//-->starting 1 becoz 1 time already reverse
        ListNode dummy=curr;
        if(p<n){
        if(head!=null){
            head.next=reverseKGroup(curr,k);
            p++;
        }
        }else{
            head.next=dummy;
             while(dummy!=null){
             dummy=dummy.next;
        }
        }
        return prev;
    }
}
