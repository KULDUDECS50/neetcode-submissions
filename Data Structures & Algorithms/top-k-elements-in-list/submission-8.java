class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // list of buckets
        List<List<Integer>> list = new ArrayList<>();
        int[] arr = new int[k];
        // creat a frequency tracker
            // value, and freq

        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int n: nums){
            hash.put(n, hash.getOrDefault(n, 0) + 1);
        }
        for(int i = 0; i < nums.length; i++){
            list.add(i, new ArrayList<>());
        }
        for(int key: hash.keySet()){
            list.get(hash.get(key)-1).add(key);
            // bucket zero is not needed
        }

        int c = 0;
        for(int i = list.size()-1; i >=0; i--){
            for(int j = 0; j < list.get(i).size(); j++){
                if(c == k){
                    return arr;
                }else{
                    arr[c] = list.get(i).get(j);
                    c++;
                }
            }
        }
        return arr;
        
        // fill bucekts
            // index of bucket, by value of key;
        // reverse traverse bucket list of k
    }
}
