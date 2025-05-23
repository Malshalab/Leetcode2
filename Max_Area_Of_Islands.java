class Solution {
    int result =0 ;
    public int maxAreaOfIsland(int[][] grid) {
        for(int r=0; r<grid.length; r++){
            for (int c=0;c<grid[0].length;c++){
                if(grid[r][c]==1){
                    result=Math.max(countDFS(grid, r,c), result );
                }
            }
        }
        return result ;
    }

    public int countDFS(int[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0){
            return 0 ;
        }
        grid[i][j]=0 ;
        int area=1 ;
        area+= countDFS(grid,i-1,j) ;
        area+= countDFS(grid,i+1,j) ;
        area+= countDFS(grid,i,j+1) ;
        area+= countDFS(grid,i,j-1) ;

        return area ;
    }
}

// iterate over map and do recursive DFS
// if we find a 1 iterate over all the ones that are adjacent to that 1 and max the number of adjacent
