class Solution {
    public int[] twoSum(int[] nums, int target) {
        // two pointers
        // left plus furthest right
        // store difference and index
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(!hash.containsKey(nums[i])){
                hash.put(diff, i);
            }
        }

        int[] res = new int[2];

        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(nums[i]) && hash.get(nums[i]) != i){
                res[0] = hash.get(nums[i]);
                res[1] = i;
                return res;

            }
        }
        return res;

    }
}
