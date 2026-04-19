class Solution {
    public boolean hasDuplicate(int[] nums) {
        // create hashmap
        HashMap<Integer, Integer> hash = new HashMap<>();
        //for loop
        for(int i: nums){
            if(hash.containsKey(i)){
                return true;
            }
            hash.put(i,1);
        }
        // if num is in in hash, return ture
        //else add rhe num to the hash
        
        return false;
    }
}