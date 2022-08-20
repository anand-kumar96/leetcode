//Merge Two Sorted Lists-->with Space method
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1);
        ListNode tail=dummy;
        if(l1==null){
            return l2;
        }else if(l2==null){
            return l1;
        }
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                tail.next=l1;
                l1=l1.next;
            }else{
                tail.next=l2;
                l2=l2.next;
            }
            tail=tail.next;
        }
         if(l1==null){
            tail.next=l2;
    }else if(l2==null){
             tail.next=l1;
         }
        return dummy.next;
}
}
// tc=O(n1+n2)
//ts=O(n1+n2)

//  Merge Two Sorted Lists-->inSpace
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if(l1==null) return l2;
        if(l2==null) return l1;
        // finding list which start with small data and assigning that list with l1
        if(l1.val>l2.val){
            ListNode temp=l1;
            l1=l2;
            l2=temp;
        }
        ListNode res=l1;
        while(l1!=null && l2!=null){
            ListNode temp=null; // every iteration
            while(l1!=null && l1.val<=l2.val){
                temp=l1;
                l1=l1.next;
            }
            temp.next=l2;
            // swap
            temp=l1;
            l1=l2;
            l2=temp;
        }
        return res;
    }
}
// tc=O(n1+n2)
//ts=O(1)
