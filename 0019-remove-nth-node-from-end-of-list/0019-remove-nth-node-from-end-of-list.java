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
    public int lengthOfLL(ListNode head){
        int count=0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int total= lengthOfLL(head);
        if (total==1){
            head=null;
            return head;
        }
        else if (total == n){
            head = head.next;
            return head;
        }
        else{
        ListNode temp = head;
        int steps= total - n + 1;
        for(int i=0;i<steps-2;i++){
            temp=temp.next;
        }
        if(n==1){temp.next = null;}
        else temp.next = temp.next.next;
        return head;
        }
    }
}