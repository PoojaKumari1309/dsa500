class Solution {
    public ListNode TwoPointer(ListNode head)
    {
        ListNode curr=head;
        int count=0;
        while(curr!=null)
        {
            curr=curr.next;
            count++;
        }
        curr=head;
        for(int i=0;i<count/2;i++)
          curr=curr.next;
        return curr;
    }
    public ListNode Hare(ListNode head)
    {
         ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode middleNode(ListNode head) {
        //return TwoPointer(head);
        return Hare(head);
    }
}
