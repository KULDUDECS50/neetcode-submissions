class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            hash.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(hash.containsKey(diff) && hash.get(diff) != i){
                arr[0] = i;
                arr[1] = hash.get(diff);
                return arr;
            }
            
        }
        return arr;
    }
}
