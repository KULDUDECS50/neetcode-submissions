class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i <= nums.length-2; i++){
            int diff = 0 - nums[i];
            int left = i+1;
            int right = nums.length-1;

            while(left < right){
                if(nums[left] + nums[right] > diff){
                    right--;
                }else if(nums[left] + nums[right] < diff){
                    left++;
                }else{
                    List<Integer> sub = new ArrayList<>();
                    sub.add(nums[i]);
                    sub.add(nums[left]);
                    sub.add(nums[right]);
                    if(!list.contains(sub)){
                        list.add(sub);
                    }
                    left++;
                    right--;
                }
            }
        }
        return list;

    }
}
