class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        left[0] = 1;
        int[] right = new int[nums.length];
        right[nums.length-1] = 1;

        for(int i = 1; i < left.length; i++){
            left[i] = nums[i-1] * 1 * left[i-1];
        }

        for(int i = left.length-2; i >= 0; i--){
            right[i] = nums[i+1] * 1 * right[i+1];
        }

        int[] prods = new int[nums.length];
        for(int i = 0; i < prods.length; i++){
            prods[i] = left[i] * right[i];
        }
        
        return prods;
    }
}  
