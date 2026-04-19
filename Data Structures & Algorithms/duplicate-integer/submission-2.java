class Solution {
    public boolean hasDuplicate(int[] nums) {
        // hashmap
        // frequenct counter
        // if it goes above 1, then reutrn true;

        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int n: nums){
            if(hash.containsKey(n)){
                return true;
            }
            hash.put(n, 1);
        }
        
        
        
        return false;

    }
}