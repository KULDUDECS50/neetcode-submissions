class Solution {
    public boolean isAnagram(String s, String t) {
        /*
        hashmap woth the itesms nad characteres
        compare hashmaps
        */
        boolean b = true;
        HashMap<Character, Integer> hash = new HashMap<>();
        char[] arr = s.toCharArray();
        if(s.length() != t.length()){
            b = false;
        }

        for(char a: arr){
            if(!hash.containsKey(a)){
                hash.put(a, 1);
            }else{
                hash.replace(a, hash.get(a), hash.get(a)+1);
            }
        }
        char[] arr2 = t.toCharArray();

        for(char a: arr2){
            if(!hash.containsKey(a)){
                b = false;
            }else{
                if(hash.get(a) == 1 ){
                    hash.remove(a);
                }else{
                    hash.replace(a, hash.get(a), hash.get(a)-1);
                
                }
            }
        }
        return b;

    }
}
