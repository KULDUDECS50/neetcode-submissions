class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int eval = 0;
        if(tokens.length == 1){
            return Integer.valueOf(tokens[0]);
        }

        for(String t: tokens){
            if(t.equals("+") && !stack.isEmpty()){
                eval = stack.pop() + stack.pop();
                stack.push(eval);
            }else if(t.equals("-") && !stack.isEmpty()){
                int x = stack.pop();
                int y = stack.pop();
                eval = y-x;
                stack.push(eval);
            }else if(t.equals("/") && !stack.isEmpty()){
                int x = stack.pop();
                int y = stack.pop();
                eval = y/x;
                stack.push(eval);
            }else if(t.equals("*") && !stack.isEmpty()){
                eval = stack.pop() * stack.pop();
                stack.push(eval);
            }else {
                stack.push(Integer.valueOf(t));
            }
            
        }

        return eval;
    }
}
