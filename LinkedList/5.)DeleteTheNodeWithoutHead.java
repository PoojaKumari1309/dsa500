class Solution {
    public void deleteNode(ListNode node) {
        //swap the values 
        int temp=node.val;
        node.val=node.next.val;
        node.next.val=temp;
        //delete the node
        node.next=node.next.next;
    }
}
