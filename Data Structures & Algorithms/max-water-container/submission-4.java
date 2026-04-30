class Solution {
    public int maxArea(int[] heights) {
        int maxArea = Math.min(heights[0],heights[1]);
        int left = 0;
        int right = heights.length-1;

        while(left < right){
            int h = Math.min(heights[left], heights[right]);
            int w = right - left;
            int area = h*w;
            maxArea = Math.max(area, maxArea);
            if(h == heights[left]){
                left++;
            }else if(h == heights[right]){
                right--;
            }  
        }

        return maxArea;
    }
}
