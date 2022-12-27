class MyStack
{
    int top;
	int arr[] = new int[1000];

  
	
	//Function to push an integer into the stack.
    void push(int a)
	{
	   
	   if(top==arr.length)
	   {return;
	        }
	        arr[top]=a;
	    top++;
	    // Your code here
	} 
	
    //Function to remove an item from top of the stack.
	int pop()
	{
       if(top==0) return -1;
       top--;
       return arr[top];// Your code here
	}
}
