class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int num: nums){
            if(hash.getOrDefault(num, 0) == 0){
                hash.put(num, 1);
            }else{
                hash.replace(num, hash.get(num) + 1);
            }
        }
        for(int num: nums){
            if(hash.get(num) > 1){
                return true;
            }
        }
           

        
        
        
        return false;
    }
}