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
    public ListNode rotateRight(ListNode head, int k) {

          if(head == null || k<=0 || head.next == null){
            return head;
        }
        ListNode last = head;// node named last starts from head
        int length = 1; ///to get length
        while(last.next !=null){
            last =last.next;// travers through list
            length++;//give length upto last node
        }
           
        last.next = head;// last pointing to head
        int rotation = k%length;//no of rotations if greater than length 
        int skip = length-rotation;//no of nodes to skip in rotation of list
        ListNode newLast = head;//newlast starts from head
        for(int i =0;i<skip-1;i++){
            newLast = newLast.next;//traverse the list upto the last element which is not involved in rotation
        }
        head = newLast.next;// head is the next node of newlast
        newLast.next = null;//next of newlast is set to null
         return head;//retured head
        }
       
    }
