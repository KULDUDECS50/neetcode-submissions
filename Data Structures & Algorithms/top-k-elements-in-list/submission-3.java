class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        HashMap<Integer, Integer> hash = new HashMap<>();

        //fill hashmap
        for(int n: nums){
            if(!hash.containsKey(n)){
                hash.put(n, 1);
            }else{
                hash.replace(n, hash.get(n)+1);
            }
        }

        List<List<Integer>> buckets = new ArrayList<>();

        for(int i = 0; i <= nums.length; i++){
            buckets.add(new ArrayList<>());
        }
        //create buckets
        for(int key: hash.keySet()){
            buckets.get(hash.get(key)).add(key);
        }
        //fill buckets

        
        //now to iterate back k
        int c = 0;
        for(int i = buckets.size()-1; i >= 0; i--){
            if(!buckets.get(i).isEmpty() && c < k ){
                for(int num: buckets.get(i)){
                    arr[c] = num;
                    c++;
                }
            }
        }



        return arr;
    }
}
