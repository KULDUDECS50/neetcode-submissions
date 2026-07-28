class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] colSet = new HashSet[9];
        HashSet<Character>[] rowSet = new HashSet[9];
        HashSet<Character>[] gridSet = new HashSet[9];
        for(int i = 0; i < 9; i++){
            colSet[i] = new HashSet<Character>();
            rowSet[i] = new HashSet<Character>();
            gridSet[i] = new HashSet<Character>();
        }
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                int hash = (i/3) * 3 + (j/3);
                char val = board[i][j];
                if(val != '.'){
                    if(!(rowSet[i].add(val) && gridSet[hash].add(val) && colSet[j].add(val))){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
