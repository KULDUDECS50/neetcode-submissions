class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prods = new int[nums.length];
        int prod = 1;
        for(int i = 0; i < prods.length; i++){
            for(int j = 0; j < prods.length; j++){
                if(j != i){
                    prod *= nums[j];
                }
            }
            prods[i] = prod;
            prod = 1;
        }
        return prods;
    }
}  
