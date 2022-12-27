	void push(int a)
	{
        QueueNode node=new QueueNode(a);
        if(front==null)
        {
            front=rear=node;
        }
        else
        {
        rear.next=node;
        rear=node;
        }
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
	    if(front==null)return -1;
	    int ans=front.data;
        front=front.next;
        return ans;
	}
}
