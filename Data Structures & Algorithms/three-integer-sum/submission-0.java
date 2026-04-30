class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sums = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i++){
            int diff = 0 - nums[i];
            int left = i + 1;
            int right = nums.length-1;
            
            while(left < right){
                if(nums[left] + nums[right] > diff){
                    right--;
                }else if(nums[left] + nums[right] < diff){
                    left++;
                }else if(nums[left] + nums[right] == diff){
                    List<Integer> subList = new ArrayList<>();
                    subList.add(nums[i]);
                    subList.add(nums[left]);
                    subList.add(nums[right]);
                    if(!sums.contains(subList)){
                        sums.add(subList);
                    }
                    left++;
                    right--;
                }
            }
        }
        return sums;
    }
}
