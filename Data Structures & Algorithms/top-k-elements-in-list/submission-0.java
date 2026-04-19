class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int i : nums){
            hash.put(i, hash.getOrDefault(i, 0) + 1);
        }
        //created frequency hashmap

        // now to create a bucket
        int[] buckets = new int[nums.length];
        List<List<Integer>> bucketList = new ArrayList<>();
        for(int i = 0; i <= nums.length; i++){
            bucketList.add(new ArrayList<>());
        }
        //fill buckets
        for(int i: hash.keySet()){
            // get freqency
            // buclet at index of the number of frequencies gets a number
            int frequency = hash.get(i);
            bucketList.get(frequency).add(i);
        }
        // iterate backward in an array
        // hit top k items right?

        int[] arr = new int[k];
        int count = 0;
        // iterate throght the whole list
        //itreate throght the lsit inside that
        // if the count is equal to k, then return

        for(int i = bucketList.size()-1; i >= 0; i--){
            for(int j: bucketList.get(i)){
                //we are wokring down a tree of the frequency, so this is justthe number
                arr[count++] = j;

                if(k == count){
                    return arr;
                }
            }
        }


        return arr;
    }
}
