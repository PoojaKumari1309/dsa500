class Solution {
    public ListNode deleteDuplicates(ListNode curr) {
        ListNode dummy=new ListNode(Integer.MIN_VALUE);
        ListNode tail=dummy;
         while(curr!=null)
        {
              if(curr.val!=tail.val)
              {
                  tail.next=curr;
                  tail=curr;
              }
              curr=curr.next;
        }
        tail.next=null;
        return dummy.next;
    }
}
