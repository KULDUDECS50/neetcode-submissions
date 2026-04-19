class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        // 1. create the hashmap K: num, V: frequency
        for(int num: nums){
            if(!hash.containsKey(num)){
                hash.put(num, 1);
            }else{
                hash.replace(num, hash.get(num)+1);
            }
        }
        //2. create list
        int[] list = new int[k];
        //3. create buckets list
        List<List<Integer>> buckets = new ArrayList<>();
    
        for (int i = 0; i <= nums.length; i++) {
            buckets.add(new ArrayList<>());
        }
        //4. fill buckets
        for(int num: hash.keySet()){
            int freq = hash.get(num);
            buckets.get(freq).add(num);
            // getting index 'freq', how does it know the index?
        }

        //5. traverse backwards
        //create counter
        int counter = 0;
        //traverse bucket (outer)
        for(int i = buckets.size()-1; i >=0; i--){
            //travers inner
            for(int j: buckets.get(i)){
                list[counter++] = j;
                if(counter == k){
                    return list;
                }
            }
        }
        return list;

        
    }
}
