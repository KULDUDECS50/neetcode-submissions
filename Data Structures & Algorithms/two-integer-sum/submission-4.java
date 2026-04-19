class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> set = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(set.containsKey(diff)){
                res[0] = set.get(diff);
                res[1] = i;

                return res;
            }
            set.put(nums[i], i);
        }
        return res;
    }
}
