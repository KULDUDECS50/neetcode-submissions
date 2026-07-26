class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] rightP = new int[nums.length];
        int[] leftP = new int[nums.length];
        int[] prodP = new int[nums.length];

        for(int i = 0;  i< nums.length; i++){
            int prodRight = 1;
            int j = i+1;
            while(j < nums.length){
               prodRight *= nums[j];
               j++; 
            }
            rightP[i] = prodRight;
        }

        for(int i = nums.length-1;  i >= 0; i--){
            int prodLeft = 1;
            int j = i-1;
            while(j >= 0){
               prodLeft *= nums[j];
               j--; 
            }
            leftP[i] = prodLeft;
        }

        for(int i = 0; i < nums.length; i++){
            prodP[i] = rightP[i] * leftP[i];
        }
        return prodP;
    }
}  
