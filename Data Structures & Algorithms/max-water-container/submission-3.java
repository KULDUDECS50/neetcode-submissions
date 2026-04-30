class Solution {
    public int maxArea(int[] heights) {
        int maxArea = Math.min(heights[0],heights[1]);
        for(int i = 0; i < heights.length-2; i++){
            int left = i;
            int right = i+1;
            while(right < heights.length){
                int h = Math.min(heights[left],heights[right]);
                int w = right - left;
                maxArea = Math.max(maxArea, h*w);
                right++;
            }
        }

        return maxArea;
    }
}
