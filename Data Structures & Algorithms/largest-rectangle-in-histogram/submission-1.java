class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for(int i = 0; i <= heights.length; i++){
            int c;
            if(i == heights.length){
                c = 0;
            }else{
                c = heights[i];
            }
            while(!stack.isEmpty() && c < heights[stack.peek()]){
                int height = heights[stack.pop()];
                int width = i;
                if(!stack.isEmpty()){
                    width  =  i - stack.peek() - 1;
                }
                maxArea = Math.max(maxArea, height*width);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
