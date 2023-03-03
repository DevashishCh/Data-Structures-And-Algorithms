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
    public ListNode removeNthFromEnd(ListNode head, int n) {
           if(head==null) {
            return head;
        }
        // if(n==1 && head.next==null) {
        //     return null;
        // }
        int count=0;
        ListNode temp=head;
        while(temp!=null) {
            count++;
            temp=temp.next;
        }
        // System.out.print(count);
        // System.out.print(n);
        if(n>count) {
            return null;
        }
         int a=count-n;
        if(a==0) {
            return head.next;
        }
        count=1;
        temp=head;
        // System.out.print(temp.val);
        while(count<a) {
            temp=temp.next;
            count++;
        }
         // System.out.print(temp.val);
        temp.next=temp.next.next;
        return head;
    }
}