class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] arr = new int[26];
        for(int i = 0; i < s.length(); i++){
            arr[((int)s.charAt(i)) - 'a']++;
            arr[((int)t.charAt(i)) - 'a']--;
            //increments up if its there
            //decrements if not
        }

        for(int i: arr){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}
