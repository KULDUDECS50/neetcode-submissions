class Solution {
    public int trap(int[] heights) {
        int water = 0;
        int[] leftMax = new int[heights.length];
        int[] rightMax = new int[heights.length];
        leftMax[0] = heights[0];
        rightMax[heights.length-1] = heights[heights.length-1];

        for(int i = 1; i < heights.length; i++){
            leftMax[i] = Math.max(leftMax[i-1], heights[i]);
        }

        for(int i = heights.length-2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i+1], heights[i]);
        }

        for(int i = 1; i < heights.length-1; i++){
            int trap = Math.min(leftMax[i], rightMax[i]) - heights[i];
            if(trap > 0){
                water += trap;
            }
        }



        return water;
    }
}
