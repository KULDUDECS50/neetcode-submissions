class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hash = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String sorted = new String(charArr);
            if(!hash.containsKey(sorted)){
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                hash.put(sorted, list);
            }else{
                hash.get(sorted).add(strs[i]);
            }
        }
        Collection<List<String>> values = hash.values();

        return new ArrayList<>(values);
    }
}
