class MinStack {
 Stack<Integer> min,stk;   
       
    public MinStack() {
         min=new Stack<>();
        stk=new Stack<>();
        min.push(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        stk.push(val);
     int newmin=(Math.min(min.peek(),val));
     min.push(newmin);
    }
    
    public void pop() {
        stk.pop();
        min.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
