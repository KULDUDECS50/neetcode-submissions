class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int n: nums){
            hash.put(n, hash.getOrDefault(n, 0) + 1);
        }
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i <= nums.length; i++){
            list.add(new ArrayList<>());
        }
        for(int key: hash.keySet()){
            list.get(hash.get(key)).add(key);
        }
        int c = 0;
        for(int i = list.size()-1; i >= 0; i--){
            if(!list.get(i).isEmpty() && c < k ){
                for(int num: list.get(i)){
                    arr[c] = num;
                    c++;
                }
            }
        }

        return arr;


        
    }
}
