public class Solution {
    public boolean hasCycle(ListNode head) {
        // method 01
        
        // if(head==null) return false;
        // HashMap<ListNode,Integer>hm=new HashMap<>();
        // while(head!=null){
        //     if(!hm.containsKey(head)){
        //         hm.put(head,1);
        //         head=head.next;
        //     }else{
        //         return true;
        //     }
        // }
        // return false;
        
        // method 02
        
        if(head==null) return false;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
            }
        return false;
        }
        
    }
