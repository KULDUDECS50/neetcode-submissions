class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> solutions = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length-2; i++){
            int diff = 0 - nums[i];
            int left = i + 1;
            int right = nums.length-1;
            
            while(left < right){
                if(nums[left] + nums[right] < diff){
                    left++;
                } else if(nums[left] + nums[right] > diff){
                    right--;
                } else{
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[left]);
                    list.add(nums[right]);
                    list.add(nums[i]);
                    if(!solutions.contains(list)){
                        solutions.add(list);
                    }
                    left++;
                    right--;
                }
            }
        }

        return solutions;
    }
}
