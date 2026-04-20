class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // some fingerprinting
        // store that in a hashmap
        // K: fingerprint. V: List<Strings> that have that key
        HashMap<String, List<String>> hash = new HashMap<>();

        for(String s: strs){
            int[] arr = new int[26];
            StringBuilder keyB = new StringBuilder();
            for(char c: s.toCharArray()){
                arr[((int)c) - 'a']++;
            }
            for(int i: arr){
                keyB.append(i).append("*");
            }
            String key = keyB.toString();
            if(!hash.containsKey(key)){
                hash.put(key, new ArrayList<>());
            }
            hash.get(key).add(s);
        }


        return new ArrayList<>(hash.values());
    }
}
