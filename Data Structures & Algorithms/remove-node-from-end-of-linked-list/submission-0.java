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

        int length = 0;
        ListNode tmp = head;
        while(tmp != null){
            length++;
            tmp = tmp.next;
        }
        if(length == n){
            return head.next;
        }
        
        
        // the one before the identiyied one
        ListNode tmp2 = head;
        int count = 0;
        int diff = length - n - 1;


        while(tmp2 != null){
            if(count == diff){
                tmp2.next = tmp2.next.next;
                break;
            }
            count++;
            tmp2 = tmp2.next;
        }
        return head;
    }
}
