// Last updated: 7/23/2025, 10:54:43 PM
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

        ListNode head = null;
        ListNode last = null;

        while(list1 != null && list2 != null){

            if(list1.val > list2.val){

                ListNode newNode = new ListNode(list2.val);

                if(head == null){
                    head = newNode;
                    last = newNode;
                }
                else{
                    last.next = newNode;
                    last = newNode;
                }

                list2 = list2.next;


            } 
            else{
                ListNode newNode = new ListNode(list1.val);
                 if(head == null){
                    head = newNode;
                    last = newNode;
                }
                else{
                    last.next = newNode;
                    last = newNode;
                }

                list1 = list1.next;
            }


        }

        if(list1 != null){
            last.next = list1;
        }

        if(list2 != null){
            last.next = list2;
        }

        return head;

    }
}