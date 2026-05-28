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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> hp=new PriorityQueue<>();
        for(ListNode list:lists){
            while(list!=null){
                hp.add(list.val);
                list=list.next;
            }
        }
        ListNode dummy=new ListNode(1);
        ListNode merge=dummy;
        while(!hp.isEmpty()){
            merge.next=new ListNode(hp.remove());
            merge=merge.next;
        }
        return dummy.next;
    }
}