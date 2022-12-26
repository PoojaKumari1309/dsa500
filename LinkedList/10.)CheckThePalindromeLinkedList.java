class Solution {
    public ListNode middle(ListNode head)
    {
        ListNode fast=head,slow=head;
        while(fast!=null && fast.next !=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }

    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null)
        {
            ListNode ahead=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ahead;
        }
        return prev;
        
    }
    public boolean isPalindrome(ListNode first) {
        ListNode mid=middle(first);
        ListNode second=reverse(mid);
        while(first!=null && second!=null)
        {
            if(first.val!=second.val)return false;
            first=first.next;
            second=second.next;
        }
        return true;
    }
}
