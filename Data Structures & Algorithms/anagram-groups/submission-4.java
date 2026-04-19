class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //get unique identifier via ascii

        //append to list

        HashMap<String, List<String>> hash = new HashMap<>();

        for(String s: strs){
            int[] arr = new int[26];
            StringBuilder builder = new StringBuilder();
            for(char c: s.toCharArray()){
                // hwo to trasnfomr char into ascii?
                arr[(((int)c) - 'a')]++;
                // needs to be 96 so no overflow
            }
            for(int i = 0; i < arr.length; i++){
                builder.append(arr[i]).append("*");
                //need this differentiator for collision handling
            }
            hash.putIfAbsent(builder.toString(), new ArrayList<>());
            hash.get(builder.toString()).add(s);
        }



        return new ArrayList<>(hash.values());
    }
}
