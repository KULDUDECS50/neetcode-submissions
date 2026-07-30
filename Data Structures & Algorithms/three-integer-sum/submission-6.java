class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i++){
            int diff = 0 - nums[i];
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int sum = nums[left] + nums[right];
                if(diff < sum){
                    right--;
                }else if(diff > sum){
                    left++;
                }else{
                    List<Integer> listN = new ArrayList<>();
                    listN.add(nums[i]);
                    listN.add(nums[left]);
                    listN.add(nums[right]);
                    if(!list.contains(listN)){
                        list.add(listN);
                    }
                    left++;
                    right--;
                }
            }
        }

        return list;
    }
}
