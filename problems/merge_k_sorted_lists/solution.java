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
import java.util.*;
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null){
            return null;
        }
        PriorityQueue<ListNode>pq = new PriorityQueue<>((a,b)-> a.val - b.val);
        for(ListNode list : lists){
            if(list!=null){
           pq.add(list);
        }
        }

        ListNode dum = new ListNode(0);
        ListNode curr = dum;

        while(!pq.isEmpty()){
            ListNode temp = pq.poll();
            curr.next = temp;
            curr= curr.next;
     
         if(temp.next !=null){
            pq.add(temp.next);
         }

        }
return dum.next;
    }
}