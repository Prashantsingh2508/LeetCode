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
        
        ListNode listNode=new ListNode(0);
        ListNode curr=listNode;
        int carry=0;

        while(l1!=null || l2!=null){

            int ans1=(l1!=null)?l1.val:0;
            int ans2=(l2!=null)?l2.val:0;

            int sum=ans1+ans2+carry;
            carry=sum/10;
            curr.next=new ListNode(sum%10);
            curr=curr.next;

            if(l1!=null) l1=l1.next;
            if(l2!=null)l2=l2.next;


        }
        curr.next=(carry>0)?new ListNode(carry%10):null;

      return  listNode.next;
        
    }
}