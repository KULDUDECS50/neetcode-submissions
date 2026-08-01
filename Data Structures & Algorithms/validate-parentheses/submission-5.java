class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char c: arr){
            if(c == '[' || c == '(' || c == '{'){
                stack.push(c);
            }else if(!stack.isEmpty() && (stack.peek() == '{' && c == '}' ||
                        stack.peek() == '(' && c == ')' ||
                        stack.peek() == '[' && c == ']') ){
                stack.pop();     
            }else{
                return false;
            }
        }


        return stack.isEmpty();
    }
}
