class GfG
{
    int twoPassAlgorithm(Node head,int n)
    {
        int count=0;
    	Node curr=head;
    	while(curr!=null)
    	{
    	    curr=curr.next;
    	    count++;
    	}
    	if(n==0 || n>count) return -1;
    	 curr=head;
    	 for(int i=0;i<count-n;i++)
    	 {
    	     curr=curr.next;
    	 }
    	 return curr.data;
    }
    
    int singleTraversal(Node head,int k)
    {
    Node fast=head,slow=head;
    for(int i=0;i<k;i++)
    {
        if(fast==null)return -1;
        fast=fast.next;
    }
    while(fast!=null)
    {
       slow=slow.next;
       fast=fast.next;
    }
    return slow.data;
    }
    
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	return singleTraversal(head,n);
    	
    }
}
