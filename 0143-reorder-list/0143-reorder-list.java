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
    public void reorderList(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer> arr=new ArrayList<>();
        while(temp!=null) {
            arr.add(temp.val);
            temp=temp.next;
        }
        int a[]=new int[arr.size()];
        int j=0;
        for(int i=0;i<arr.size();i+=2) {
            a[i]=arr.get(j);
            j++;
        }
        j=arr.size()-1;
        for(int i=1;i<arr.size();i+=2) {
            a[i]=arr.get(j);
            j--;
        }
        temp=head;
        for(int i=0;i<arr.size();i++) {
            temp.val=a[i];
            temp=temp.next;
        }
    }
}