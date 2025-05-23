class Solution {
    public int numIslands(char[][] grid) {
        int count =0 ;
        for(int r=0; r<grid.length; r++){
            for(int c=0; c<grid[0].length; c++){
                if(grid[r][c]=='1'){
                    count=count+1 ;
                    DFS(grid,r,c) ;
                }
            }
        }

        return count ;
    }

    public void DFS(char[][] grid, int i, int j){
        if( i<0|| i>=grid.length ||  j<0|| j>=grid[0].length||grid[i][j]=='0'){
            return ;
        }
        grid[i][j]='0' ;
        

        DFS(grid,i+1,j) ;
        DFS(grid,i-1,j) ;
        DFS(grid,i,j+1) ;
        DFS(grid,i,j-1) ;
    }
}

// we are going to check every row and every column
// If we hit a 1 we increase the island count and call DFS
// We run DFS on all the adjacent nodes and make them into zeros so we dont hit them again
// return the count
