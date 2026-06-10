class Solution {
    public boolean isAnagram(String s, String t) {
        if(t.length() != s.length()){
            return false;
        }
        int[] arr = new int[26];
        for(int i = 0; i < s.length(); i++){
            arr[((int)s.charAt(i)) - 'a']++;
            arr[((int)t.charAt(i)) - 'a']--;
        }

        
        for(int i: arr){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}
