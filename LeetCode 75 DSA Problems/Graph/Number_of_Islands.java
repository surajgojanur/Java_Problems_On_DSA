class Solution {
    public int numIslands(char[][] grid) {
        int rows=grid.length, cols=grid[0].length;
        boolean[][] visited=new boolean[rows][cols];
        int count=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]=='1' && visited[i][j]==false){
                    dfs(i,j,rows,cols,visited,grid);
                    count++;
                }
            }
        }
        return count;
    }
    
    private void dfs(int row,int col,int rows,int cols,boolean[][] visited,char[][] grid){
        if(row<0 || col<0 || row>=rows || col>=cols || visited[row][col] || grid[row][col]=='0'){
            return;
        }
            visited[row][col]=true;
        
        dfs(row+1,col,rows,cols,visited,grid);
        dfs(row-1,col,rows,cols,visited,grid);
        dfs(row,col+1,rows,cols,visited,grid);
        dfs(row,col-1,rows,cols,visited,grid);
    }
}
