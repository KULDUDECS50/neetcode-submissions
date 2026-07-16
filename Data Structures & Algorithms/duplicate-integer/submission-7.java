class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i: nums){
            hash.put(i, hash.getOrDefault(i ,0) + 1);
            if(hash.get(i) > 1){
                return true;
            }
        }
        return false;
    }
}