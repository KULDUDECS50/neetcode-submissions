class Solution {
    public int[] dailyTemperatures(int[] temps) {
        Stack<Integer> stack = new Stack();
        int[] arr = new int[temps.length];

        for(int i = temps.length-1; i  >= 0; i--){
            arr[i] = 0;
            while(!stack.isEmpty() && temps[i] >= temps[stack.peek()]){
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
