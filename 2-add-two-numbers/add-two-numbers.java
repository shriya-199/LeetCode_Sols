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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode dummyNode = new ListNode(-1);
        ListNode dummyTemp = dummyNode;
        int carry = 0;
        while(temp1!=null && temp2!=null)
        {
            int sum = temp1.val+temp2.val;
            ListNode newNode = new ListNode((sum+carry)%10);
            dummyTemp.next=newNode;
            dummyTemp=newNode;
            carry = (sum+carry)/10;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        while(temp1!=null)
        {
            ListNode newNode = new ListNode((temp1.val+carry)%10);
            dummyTemp.next=newNode;
            dummyTemp=newNode;
            carry = (temp1.val+carry)/10;
            temp1=temp1.next;
        }
        while(temp2!=null)
        {
            ListNode newNode = new ListNode((temp2.val+carry)%10);
            dummyTemp.next=newNode;
            dummyTemp=newNode;
            carry = (temp2.val+carry)/10;
            temp2=temp2.next;
        }
        if(carry!=0)
        {
            ListNode newNode = new ListNode(1);
            dummyTemp.next=newNode;
        }

        return dummyNode.next;
    }
}