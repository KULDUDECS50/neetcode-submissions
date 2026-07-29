class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rowSet = new HashSet[9];
        HashSet<Character>[] colSet = new HashSet[9];
        HashSet<Character>[] gridSet = new HashSet[9];

        for(int i = 0; i < 9; i++){
            rowSet[i] = new HashSet<Character>();
            colSet[i] = new HashSet<Character>();
            gridSet[i] = new HashSet<Character>();
        }

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char a = board[i][j];
                int hash = (i/3) * 3 + (j/3);
                if(a != '.'){
                    if(!rowSet[i].add(a) || !colSet[j].add(a) || !gridSet[hash].add(a)){
                        return false;
                    }
                }
            }
        }
        return true;

    }
}
