class Solution {

    public String encode(List<String> strs) {
        // 
        StringBuilder res = new StringBuilder();
        for(String s: strs){
            res.append(s.length()).append("@").append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {

        List<String> strings = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < str.length()){
            if(str.charAt(j) == '@'){
                int len = Integer.parseInt(str.substring(i,j));
                String word = str.substring(j+1, j+1+len);
                strings.add(word);
                i = j + 1+ len;
                j += 1+ len;
            }
            else{
                j++;
            }
        }


        return strings;

    }
}
