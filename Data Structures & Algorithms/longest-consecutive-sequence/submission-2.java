class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        int max = 0;
        
        for(int n: nums){
            set.add(n);
        }

        HashSet<Integer> startSet = new HashSet<>();
        for(int s: set){
            if(!set.contains(s-1)){
                startSet.add(s);
            }
        }
        for(int s: startSet){
            int count = 0;
            while(set.contains(s+count)){
                count++;
            }
            max = Math.max(max, count);
        }
        
        return max;
    }
}
