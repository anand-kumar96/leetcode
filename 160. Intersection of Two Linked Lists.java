// method 01
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptr1=headA;
        ListNode ptr2=headB;
        int count1=0;
        int count2=0;
        while(ptr1!=null){
            ptr1=ptr1.next;
            count1++;
        }
         while(ptr2!=null){
            ptr2=ptr2.next;
            count2++;
        }
         ptr1=headA;
         ptr2=headB;
        int diff=Math.abs(count1-count2);
        if(count1>count2){
            while(diff>0 && ptr1!=null){
                ptr1=ptr1.next;
                diff--;
            }
        }else if(count2>count1){
             while(diff>0 && ptr2!=null){
                ptr2=ptr2.next;
                diff--;
            }
        }     
        while(ptr1!=null && ptr2!=null){
            if(ptr1==ptr2){
                return ptr1;
            }else
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        return null;
    }
}

// method 02
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1=headA;
        ListNode l2=headB;
        while(l1!=l2){
            if(l1==null) l1=headB;
            else l1=l1.next;
            
            if(l2==null) l2=headA;
            else l2=l2.next;
        }
        return l1;//l2
    }
}
