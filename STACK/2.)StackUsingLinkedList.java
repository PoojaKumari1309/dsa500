 StackNode head=null;
    
    //Function to push an integer into the stack.
    void push(int a) 
    {
        StackNode node=new StackNode(a);
        node.next=head;
        head=node;
        
    }
    
    //Function to remove an item from top of the stack.
    int pop() 
    {
        if(head==null) return -1;
        int ans=head.data;
       head=head.next;
       return ans;
       
    }
}
