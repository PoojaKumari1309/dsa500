class MyQueue {
    Stack<Integer> actual=new Stack<>();
    Stack<Integer> extra=new Stack<>();
    public void push(int x) {
        while(actual.size()>0)
        {
            extra.push(actual.pop());
        }
        actual.push(x);
        while(extra.size()>0)
        {
            actual.push(extra.pop());
        }
    }
    
    public int pop() {
       return actual.pop();
    }
    
    public int peek() {
        return actual.peek();
    }
    
    public boolean empty() {
        return actual.size()==0;
    }
}
