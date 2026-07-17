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
        int lef = 0;
        int rig = 0;
        while(rig < str.length()){
            if(str.charAt(rig) == '#'){
                int len = Integer.parseInt(str.substring(lef,rig));
                list.add(str.substring(rig+1, rig+len + 1));
                lef = rig + len + 1;
                rig = lef;
            }
            rig++;
        }
        return list;

    }
}
