class Solution {
    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        res[res.length-1]=-1;
        int max = arr[res.length-1];
        for(int i = res.length-2; i >= 0; i--){
            // skip that first one
            if(arr[i+1] > max){
                max = arr[i+1];
            }
            res[i] = max;
        }
        return res;
    }
}