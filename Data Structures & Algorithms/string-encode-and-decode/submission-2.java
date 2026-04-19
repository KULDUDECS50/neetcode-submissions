class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(String s: strs){
            str.append(s.length()).append('#').append(s);
        }
        return str.toString();

    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        //create list
        int pLeft = 0;
        //left pointer
        while(pLeft < str.length()){
            //iterate whole string
            int pRight = pLeft;
            while(str.charAt(pRight) != '#'){
                pRight++;
                // increment to that spot
            }
            int len = Integer.parseInt(str.substring(pLeft, pRight));
            String word = str.substring(pRight+1, 1+pRight+len);
            //

            list.add(word);
            pLeft = pRight + 1 + len;
            //right since it needs to start there at the rightmost?
            // and that extra 1 is to make sure there is no offset to the left
            
        }
        return list;
    }
}
