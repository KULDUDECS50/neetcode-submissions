class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int[] arr = new int[k];
        //track frequencies
        for(int n: nums){
            hash.put(n, hash.getOrDefault(n, 0) + 1);
        }
        //create list of buckets
        List<List<Integer>> buckets = new ArrayList<>();
        for(int b = 0; b < nums.length; b++){
            buckets.add(new ArrayList<>());
        }
        // fills buckets
        for(int key : hash.keySet()){
            buckets.get(hash.get(key) - 1).add(key);
        }

        //now go backwards
        int c = 0;
        for(int i = nums.length-1; i >= 0; i--){
            for(int l = buckets.get(i).size()-1; l >= 0; l--){
                arr[c] = buckets.get(i).get(l);
                c++;
                if(c == k){
                    return arr;
                }
            }
        }
        return arr;
    }
}
