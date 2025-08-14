// Last updated: 8/15/2025, 12:01:27 AM
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null) return list2;
        if(list2 == null) return list1;
        
        ListNode mergedList = new ListNode();
        ListNode head = null;

        while(list1 != null && list2 != null){

            if(list1.val > list2.val){
                mergedList.next = list2;
                list2 = list2.next;

                 if(head == null){
                    head = mergedList;
                    head = mergedList.next;
                }

                mergedList = mergedList.next;

            }
            else {
                
                mergedList.next  = list1;
                list1 = list1.next;
                 if(head == null){
                    head = mergedList;
                     head = mergedList.next;
                }
                mergedList = mergedList.next;
            }
            

        }

        if(list1 != null){
            mergedList.next = list1;
        }

       else{
            mergedList.next = list2;
        }



        return head;


    }
}