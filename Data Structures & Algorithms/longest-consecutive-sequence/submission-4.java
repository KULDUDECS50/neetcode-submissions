class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i: nums){
            hash.add(i);
        }
        int maxCount = 0;
        int index = 0;
        while (index < nums.length){
            int curr = 1;
            int app = 1;
            while(hash.contains(nums[index] + app)){
                curr++;
                app++;
                
            }
            maxCount = Math.max(maxCount, curr);
            index++;
        }
        return maxCount;
    }
}
