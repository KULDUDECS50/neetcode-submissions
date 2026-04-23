class MinStack {

    private static Stack<Integer> stack;
    private static Stack<Integer> minStack;
    

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        int top = stack.pop();
        if (top == minStack.peek()) {
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        // int min = stack.peek();
        // Stack<Integer> temp = stack;

        // for(int i: stack){
        //     if(i < min){
        //         min = i;
        //     }
        // }
        // return min;
        return minStack.peek();
    }
}
