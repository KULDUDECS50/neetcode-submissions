class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(String s: strs){
            str.append(s.length()).append("#").append(s);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        int r = 1;

        List<String> words = new ArrayList<>();

        while(r < str.length()){
            if(str.charAt(r) == '#'){
                int len = Integer.parseInt(str.substring(i,r));
                String word = str.substring(r+1, r+1+len);
                words.add(word);
                i = r + 1 + len;
                r = i;
            }else{
                r++;
            }
        }
        return words;

    }
}
