class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0; row < board.length; row++){
            HashSet<Character> rowSet = new HashSet<>();
            for(int col =0; col < board[row].length; col++){
                if(board[row][col] != '.' && rowSet.contains((board[row][col]))){
                    return false;
                }
                rowSet.add((board[row][col]));
            }
        }
        for(int row = 0; row < board.length; row++){
            HashSet<Character> colSet = new HashSet<>();
            for(int col = 0; col < board[row].length; col++){
                if(board[col][row] != '.' && colSet.contains((board[col][row]))){
                    return false;
                }
                colSet.add((board[col][row]));
            }
        }

        for(int bigBox_R = 0; bigBox_R < 9; bigBox_R+=3){
           for(int bigBox_C = 0; bigBox_C < 9; bigBox_C+=3){
                HashSet<Character> lilBox_Set = new HashSet<>();
                for(int lilBox_R = bigBox_R; lilBox_R < bigBox_R+3; lilBox_R++){
                    for(int lilBox_C = bigBox_C; lilBox_C < bigBox_C + 3; lilBox_C++){
                        if(board[lilBox_R][lilBox_C] != '.' && lilBox_Set.contains((board[lilBox_R][lilBox_C]))){
                            return false;
                        }
                        lilBox_Set.add((board[lilBox_R][lilBox_C]));

                    }
                }
                
            
            } 
        }



        return true;
        
    }
}
