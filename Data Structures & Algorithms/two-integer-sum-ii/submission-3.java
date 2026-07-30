class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];

        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int sum = nums[left] + nums[right];
            if(target > sum){
                left++;
            }else if(target < sum){
                right--;
            }else{
                arr[0] = left+1;
                arr[1] = right+1;
                return arr;
            }
        }

        return arr;
    }
}
