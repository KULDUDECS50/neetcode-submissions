class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<HashSet<Character>> row = new ArrayList<>(9);
        List<HashSet<Character>> col = new ArrayList<>(9);
        List<HashSet<Character>> grid = new ArrayList<>(9);
        

        for(int i = 0; i < 9; i++){
            row.add(new HashSet<>());
            col.add(new HashSet<>());
            grid.add(new HashSet<>());
        }

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char b = board[i][j];
                int ind = (i/3) * 3 + (j/3);
                if(b != '.'){
                    if(!row.get(i).add(b) || !col.get(j).add(b) || !grid.get(ind).add(b)){
                        return false;
                    }
                }

            }
        }
                


        return true;
    }
}
