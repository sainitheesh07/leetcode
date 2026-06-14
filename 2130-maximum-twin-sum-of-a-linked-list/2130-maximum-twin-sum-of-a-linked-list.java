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
    public int pairSum(ListNode head) {
        Stack<Integer> s=new Stack<>();
        ListNode fast=head;
        ListNode slow =head;
        while(fast!=null && fast.next!=null){
            s.push(slow.val);
            slow=slow.next;
            fast=fast.next.next;
        }
        int r=0;
        while(slow!=null){
            r=Math.max(r,s.pop()+slow.val);
            slow=slow.next;
        }
        return r;
    }
}