class Solution {
    public int carFleet(int target, int[] pos, int[] speed) {
        TreeMap<Integer, Integer> tree = new TreeMap<>();
        for(int i = 0; i < pos.length; i++){
            tree.put(target - pos[i], speed[i]);
            // key: delta x
            // value: speed
        }
        double pace = 0.0;
        int fleets = 0;
        
        for(int key: tree.keySet()){
            double time = (double)key / tree.get(key);
            if(time > pace){
                pace = time;
                fleets++;
            }
        }

        return fleets;
    }
}
