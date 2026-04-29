class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        for(int i  = 0; i < nums.length; i++){
            if(!set.contains(nums[i] - 1)){
                // found a start
                int start = nums[i];
                int count = 1;
                while(set.contains(start + 1)){
                    start++;
                    count++;
                }
                max = Math.max(max, count);
            }
            
        }


        return max;
    }
}
