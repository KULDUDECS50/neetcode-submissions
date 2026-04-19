class Solution {

    public String encode(List<String> strs) {
        // extract word
        // get length
        // append a $
        StringBuilder string = new StringBuilder();
        for(String s: strs){
            string.append(s.length()).append('#').append(s);
        }
        return string.toString();
    }

    public List<String> decode(String str) {
        // extract string 
        List<String> list = new ArrayList<>();
        int left = 0;
        while(left < str.length()){
            int right = left;
            while(str.charAt(right) != '#'){
                right++;
            }
            int len = Integer.parseInt(str.substring(left, right));
            String sub = str.substring(right+1, 1 + len + right);
            list.add(sub);
            left = right + len + 1;
        }
        return list;
    }
}
