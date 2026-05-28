class Solution {
    public void reorderList(ListNode head) {
        if(head==null) return;
        ListNode slow=head,fast=head;
        while(fast !=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode prev=null,curr=slow,ne;
        while(curr!=null){
            ne=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ne;
        }

        ListNode first=head,second=prev,temp;
        while(second.next!=null){
            temp=first.next;
            first.next=second;
            first=temp;

            temp=second.next;
            second.next=first;
            second=temp;
        }
    }
}