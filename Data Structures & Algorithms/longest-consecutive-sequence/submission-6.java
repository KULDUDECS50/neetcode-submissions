class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i: nums){
            hash.add(i);
        }
        int max = 0;
        for(int s: hash){
            if(!hash.contains(s-1)){
                int curr = 1;
                while(hash.contains(s + curr)){
                    curr++;
                }
                max = Math.max(max, curr);
            }
        }
        return max;
    }
}
