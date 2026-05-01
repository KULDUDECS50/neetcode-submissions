class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            hash.put(nums[i], i);
            // number : index
        }

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(hash.containsKey(diff) && hash.get(diff) != i){
                sum[0] = i;
                sum[1] = hash.get(diff);
                return sum;
            }
        }

        return sum;
    }
}
