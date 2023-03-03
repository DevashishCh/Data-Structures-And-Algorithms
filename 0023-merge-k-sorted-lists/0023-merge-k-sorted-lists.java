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
        if(lists.length==0) {
            return null;
        }
        for(int i=1;i<lists.length;i++) {
            lists[0]=sort(lists[0],lists[i]);
        }
        return lists[0];
    }
    public ListNode sort(ListNode z,ListNode r) {
        if(z==null) {
            return r;
        }
        if(r==null) {
            return z;
        }
        ListNode result=null;
        if(r.val>=z.val) {
            result=z;
            result.next=sort(z.next,r);
        }else{
            result=r;
            result.next=sort(z,r.next);
        }
        return result;
    }
}