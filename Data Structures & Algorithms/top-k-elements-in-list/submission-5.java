class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int i: nums){
            hash.put(i, hash.getOrDefault(i, 0) + 1);
        }
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i <= nums.length; i++){
            list.add(new ArrayList<>());
        }
        for(int key: hash.keySet()){
            list.get(hash.get(key)).add(key);
        }
        int count = 0;
        for(int i = list.size() - 1; i >= 0; i--){
            for(int j = 0; j < list.get(i).size(); j++){
                if(count < k){
                    arr[count] = list.get(i).get(j);
                }
                count++;
            }
        }




        return arr;   
    }
}
