class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
            hash.put(i, temperatures[i]);
        }
        //Key: Index
        //Value: Temperatures
        for(int i = temperatures.length-1; i >= 0; i--){
            while(!stack.isEmpty() && hash.get(stack.peek()) <= hash.get(i)){
                stack.pop();
            }
            if(stack.isEmpty()){
                arr[i] = 0;
            }else{
                arr[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return arr;
    }
}
