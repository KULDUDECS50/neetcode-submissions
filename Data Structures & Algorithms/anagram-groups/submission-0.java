class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // for each word, sort it
        // if that sorted word is a key in the map, add that to the list (value)
        // return list somehow by feeding it into that
        // map the sorted string to the list of strings
        HashMap<String, List<String>> hash = new HashMap<>();

        for(String s: strs){
            String f = s;
            char[] chars = f.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if(!hash.containsKey(sorted)){
                hash.put(sorted, new ArrayList<>());
            }
            hash.get(sorted).add(f);
        }

        return new ArrayList<>(hash.values());
    }
}
