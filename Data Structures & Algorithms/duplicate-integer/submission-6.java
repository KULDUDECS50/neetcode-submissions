class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int num: nums){
            if(hash.putIfAbsent(num, 1) != null){
                return true;
            }
        }

        return false;
    }
}