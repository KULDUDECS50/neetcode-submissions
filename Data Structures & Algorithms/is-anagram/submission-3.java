class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        // load one into hashMap
        HashMap<Character, Integer> hash = new HashMap<>();

        for(char c: s.toCharArray()){
            if(hash.getOrDefault(c, 0) == 0){
                hash.put(c, 1);// this needs to be 1 to be visited
            }else{
                hash.replace(c, hash.get(c)+1);
            }
        }
        // load next into same hashmap -- subtract similar ones

        for(char c: t.toCharArray()){
            if(hash.containsKey(c) && hash.get(c) > 0){
                hash.replace(c, hash.get(c)-1);
            }
        }

        // compare in for each loop that all are zero

        for(char c: hash.keySet()){
            if(hash.get(c)!=0){
                return false;
            }
        }

        return true;
    }
}
