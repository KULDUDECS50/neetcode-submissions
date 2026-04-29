class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        int eval = Integer.parseInt(tokens[0]);
        for(int i = 0; i < tokens.length; i++){
            stack.push(tokens[i]);
            if(!stack.isEmpty()){
                if(stack.peek().equals("+")){
                    stack.pop();
                    int sum = Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop());
                    eval = sum;
                    stack.push(String.valueOf(sum));
                }else if(stack.peek().equals("-")){
                    stack.pop();
                    int x = Integer.parseInt(stack.pop());
                    int y = Integer.parseInt(stack.pop());
                    eval = (y-x);
                    stack.push(String.valueOf(y-x));
                }else if(stack.peek().equals("*")){
stack.pop();
                    int prod = Integer.parseInt(stack.pop()) * Integer.parseInt(stack.pop());
                    eval = prod;
                    stack.push(String.valueOf(prod));
                }else if(stack.peek().equals("/")){
                    stack.pop();
                    int x = Integer.parseInt(stack.pop());
                    int y = Integer.parseInt(stack.pop());
                    eval = (y/x);
                    stack.push(String.valueOf(y/x));
                }
            }
        }
        return eval;
    }
}
