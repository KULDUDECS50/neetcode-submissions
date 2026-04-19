class Solution {
    public boolean isAnagram(String s, String t) {
        // check if strings are same length
        if (s.length() != t.length()) {
            return false;
        }

        /*
        HashMap
        verify if hashmap is 0

        */

        HashMap<Character, Integer> hash = new HashMap<>();
        int[] arr = new int[26];

            for (int i = 0; i < s.length(); i++) {
            // if it doesnt contain, add new and 1
            // if its does contain increment the number

            // int val = ((int) s.charAt(i) - 65);
            // int val2 = ((int) s.charAt(i) - 65);

            arr[(((int) s.charAt(i)) - 97)]++;
            arr[(((int) t.charAt(i)) - 97)]--;
        }

        for (int a : arr) {
            if (a != 0) {
                return false;
            }
        }

        return true;
    }
}
