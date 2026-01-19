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
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode present = head;
        
       while(present!=null){
        ListNode next = present.next;
          present.next = prev;
          prev = present;
          present = next;
       
       if(next != null)
       {
        next=next.next;
       }
       }
       return prev;
    }
    
    

    public ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null&& fast.next!= null){
            slow=slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
         ListNode middle =  middleNode(head);
         ListNode headSecond = reverse(middle);
         ListNode rereversehead = headSecond;

         while(head !=null && headSecond != null){
            if(head.val != headSecond.val){
                break;
            }else{
                head = head.next;
                headSecond = headSecond.next;
            }
         }
         reverse(rereversehead);
         if(head==null || headSecond ==null){
            return true;
         }
     return false;
    }
}