class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i <= heights.length; i++){
            //check for  a left
            int c;
            if(i == heights.length){
                c = 0;
            }else{ 
                c = heights[i];
            }
            while(!stack.isEmpty() && c < heights[stack.peek()]){
                int h = heights[stack.pop()];
                int w = i;
                if(!stack.isEmpty()){
                    w = i - stack.peek() - 1;
                }
                maxArea = Math.max(maxArea, h*w);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
