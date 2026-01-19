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
    public ListNode mid( ListNode head ){
      ListNode s = head;
      ListNode f = head;
      while(f!= null && f.next!=null){
        s= s.next;
        f =f.next.next;
      }
      return s;
    
    }
    public ListNode rev( ListNode head ){
     ListNode prev = null;
     ListNode current = head;
     ListNode next = current.next;
     while(current != null){
        current.next=prev;
        prev = current;
        current = next;
        if(next!= null){
            next = next.next;
        }
     }
     return prev;

    }

    public void reorderList(ListNode head) {
        ListNode mid = mid(head );
        ListNode head2 = rev(mid);
        ListNode head1 =head;
        while(head1 != null && head2 !=null){

          ListNode temp = head1.next;

            head1.next = head2;
            head1= temp;
           

            temp = head2.next;
            head2.next=head1;
            head2=temp;

        }

    if(head1 !=null){
        head1.next =null;

    }
}
}