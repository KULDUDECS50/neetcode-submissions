class Solution {
    public boolean isValidSudoku(char[][] board) {

        //columns
        for(int row = 0; row < board.length; row++){
            HashSet<Character> rowSet = new HashSet<>();
            
            for(int cell = 0; cell < board[0].length; cell++){
                if(board[row][cell] != '.' && rowSet.contains(board[row][cell])){
                    return false;
                    
                }else{
                    rowSet.add(board[row][cell]);
                }

            }
        }


        //columns
        for(int row = 0; row < board.length; row++){
            HashSet<Character> colSet = new HashSet<>();
            
            for(int cell = 0; cell < board[0].length; cell++){
                if(board[cell][row] != '.' && colSet.contains(board[cell][row])){
                    return false;
                    
                }else{
                    colSet.add(board[cell][row]);
                }

            }
        }


        //3x3
        // 3x3 Boxes
        for(int row = 0; row < board.length; row += 3){
            for(int cell = 0; cell < board[0].length; cell += 3){
                
                HashSet<Character> boxSet = new HashSet<>();
                
                // The missing inner loops to scan the 3x3 grid
                for(int i = 0; i < 3; i++) {
                    for(int j = 0; j < 3; j++) {
                        
                        // Add the anchor and the scanner together
                        char currentChar = board[row + i][cell + j];
                        
                        if(currentChar != '.') {
                            if(boxSet.contains(currentChar)){
                                return false;
                            } else {
                                boxSet.add(currentChar);
                            }
                        }
                    }
                }

            }
        }


        return true;
    }
}
