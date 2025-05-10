class Solution {
    public boolean isValidSudoku(char[][] board) {

    Set<Character>[] cols = new HashSet[9];  
    Set<Character>[] rows = new HashSet[9];  
    Set<Character>[] boxes = new HashSet[9]; 

    for (int i = 0; i < 9; i++) {
        cols[i] = new HashSet<>() ;
        rows[i] = new HashSet<>() ;
        boxes[i] = new HashSet<>() ;
    }

    for (int row=0; row<board.length ; row++){
        for (int col=0; col<board.length; col++){
            int boxIndex=(row/3)*3 +(col/3) ;
            if(board[row][col]=='.'){
                continue ;
            }
            if(cols[col].contains(board[row][col]) 
            ||rows[row].contains(board[row][col])  
            ||boxes[boxIndex].contains(board[row][col])){
                return false ;
            }
            else{
                cols[col].add(board[row][col]) ;
                rows[row].add(board[row][col]) ;
                boxes[boxIndex].add(board[row][col]) ;
            }
        }     
    }
    return true ;
    }
}

// We will create a new hashmap for each row column and box on the board
// We will iterate through this board adding new elements to the each hasmpa if they do not exist
// We will go through each row if the row contains duplicates, false
// if the column contains duplicates then false
// if the box contains duplicates then false
