class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> stack = new Stack();
        int[] arr = new int[t.length];

        for(int i = t.length-1; i >= 0; i--){
            arr[i] = 0;
            while(!stack.isEmpty() && t[stack.peek()] <= t[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                arr[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return arr;

        
    }
}
