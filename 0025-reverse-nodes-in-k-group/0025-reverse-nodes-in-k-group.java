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
        int count=1;
        int noOfSwaps=0;
        ListNode temp=head;
        while(temp!=null) {
            temp=temp.next;
            count++;
        }
        noOfSwaps=count/2;
        ListNode dummyHead=new ListNode(-1);
        ListNode start=dummyHead;
        ListNode end=dummyHead;

        ListNode currStart=head;
        ListNode currEnd=head;

        while(noOfSwaps>0) {

            for(int i=0;i<k-1 && currEnd!=null;i++) {
                
                currEnd=currEnd.next;
            }
            if(currEnd!=null) {
                ListNode nxt=currEnd.next;
                currEnd.next=null;
                
                ListNode rev =  reverse(currStart);

                start.next=rev;

                while(end.next!= null) {
                    end=end.next;
                }

                end.next=nxt;
                start=end;
                currStart=end.next;
                currEnd=end.next;

            }
            
            noOfSwaps--;
        }
        return dummyHead.next;

    }

    public ListNode reverse(ListNode head) {
        ListNode prev=null;
        ListNode next;
        while(head!=null) {
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        System.out.println(prev);
        return prev;
    }
}