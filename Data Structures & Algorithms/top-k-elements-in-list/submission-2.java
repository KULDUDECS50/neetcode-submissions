class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // createa a hashap
        HashMap<Integer, Integer> numFreq = new HashMap<>();
        for(int i: nums){
            if(!numFreq.containsKey(i)){
                numFreq.put(i,1);
            }else{
                numFreq.put(i, numFreq.get(i)+1);
            }
        }

        // set up buckets
        List<List<Integer>> buckets = new ArrayList<>();
        for(int i = 0; i <= nums.length; i++){
            buckets.add(new ArrayList<>());
        }
        int seen = 0;
        for(int key: numFreq.keySet()){
            buckets.get(numFreq.get(key)).add(key);
        }
        int[] arr = new int[k];
        int count = 0;
        for(int i = buckets.size()-1; i >= 0; i--){
            for(int j = buckets.get(i).size()-1; j >= 0; j--){
                if(count < k){
                    arr[count] = buckets.get(i).get(j);
                    count++;
                }else{
                    return arr;
                }
            }
        }
        return arr;

    }
}
