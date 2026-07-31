class MinStack {

    Stack<Integer> stack;
    Stack<Integer> min;
    public MinStack() {
        stack = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        if(min.isEmpty() || (!min.isEmpty() && val <= min.peek())){
            min.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        if(!min.isEmpty() && stack.peek() <= min.peek()){
            min.pop();
        }
        stack.pop();
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        if(!min.isEmpty()){
            return min.peek();
        }else{
            return stack.peek();
        }
    }
}
