class Solution {

    public String encode(List<String> strs) {
        // encode with some non ascii
        StringBuilder str = new StringBuilder();
        for(String s: strs){
            str.append(s.length()).append("#").append(s);
        }
        return str.toString();
        //5#Hello5#World
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(j < str.length()){
            j++;
            if(str.charAt(j) == '#'){
                int length = Integer.parseInt(str.substring(i,j));
                String word = str.substring(j+1, j + length + 1);
                list.add(word);
                i = j + length + 1;
                j = i;
            }
        }

        return list;
    }
}
