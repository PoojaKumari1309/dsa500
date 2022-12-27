class MyQueue {
	int arr[] = new int[100005];

    
		int front=0;
	    int	rear=0;
	    int size=0;
	
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    if(size==arr.length)return;
	    arr[rear]=x;
	    rear++;
	    size++;
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
	    if(size==0)return -1;
	    int ans=arr[front];
	    front++;
	    size--;
	    return ans;
		// Your code here
	} 
}

