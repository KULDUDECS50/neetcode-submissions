class Solution {
    public int appendCharacters(String s, String t) {
        int c = t.length();
        int point = 0;
        for(int i = 0 ; i < s.length(); i++){
            if(point < t.length() && t.charAt(point) == s.charAt(i)){
                c--;
                point++;    
            }

            
        }
        return c;
    }
}