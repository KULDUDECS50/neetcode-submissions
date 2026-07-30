class Solution {
    public int[] productExceptSelf(int[] nums) {
        int first[] = new int[nums.length];
        int second[] = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int currP = 1;

            if(i != nums.length-1){
                for(int j = i+1; j < nums.length; j++){
                    currP *= nums[j];
                }
            }
            first[i] = currP;
        }

        for(int i = nums.length-1; i >= 0 ; i--){
            int currP = 1;
            if(i > 0){
                for(int j = i-1; j >= 0; j--){
                    currP *= nums[j];
                }
            }
            second[i] = currP;
        }
        int prds[] = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            prds[i] = first[i] * second[i];
        }
        return prds;
    }
}  
