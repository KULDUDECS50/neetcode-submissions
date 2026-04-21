class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> id_words = new HashMap<>();

        for(String s: strs){
            int[] arr = new int[26];
            StringBuilder prog = new StringBuilder();
            for(char c: s.toCharArray()){
                arr[((int)c) - 'a']++;
            }
            for(int i: arr){
                prog.append(String.valueOf(i)).append("#");
            }
            String word = prog.toString();
            if(!id_words.containsKey(word)){
                id_words.put(word, new ArrayList<>());
            }
            id_words.get(word).add(s);
            
            
        }

        return new ArrayList<>(id_words.values());









    }
}
