class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int diff = target-nums[i];
            if(hash.containsKey(diff)){
                arr[1] = i;
                arr[0] = hash.get(diff);
                return arr;
            }
            hash.put(nums[i], i);
        }
        return arr;
    }
}
