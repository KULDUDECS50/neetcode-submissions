class MinStack {

    private static Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        int min = stack.peek();
        Stack<Integer> temp = stack;

        for(int i: stack){
            if(i < min){
                min = i;
            }
        }
        return min;

    }
}
