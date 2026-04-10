package week4.DataStructures.Nonlinear.Graphs;
//Number of island
 class Solution {
     //Directions 8 top, bottom, right, left, and 4 diagonals
    int[] dx={-1,-1,-1,0,0,1,1,1};
    int[] dy={-1,0,1,-1,1,-1,0,1};
    public int countIslands(char[][] grid){
        int n= grid.length;
        int m=grid[0].length;
        int islandCount=0;
        boolean[][] visited=new boolean[n][m];
        //Traverse each cell
        for(int i=0; i<n;i++){
            for(int j=0;j<m;j++){
                //if it is land and not visited do a dfs call and count.
                if(grid[i][j]=='L' && !visited[i][j]){
                    //Call a dfs from that celll and visit whole isLand
                    dfs(i,j,grid,visited, n, m);
                    islandCount++; //One island visited
                }
            }
        }
        return islandCount;
    }
    void dfs(int x, int y, char[][] grid, boolean[][] visited, int n, int m){
        visited[x][y]=true;
        for(int dir=0;dir<8;dir++){
            int newX=x+dx[dir];
            int newY=y+dy[dir];
            //Make sure the vales are inside the boundary.
            //They should be Lands 'L' and should not be visited
            if(newX>=0 && newY>=0 && newX<n && newY<m && grid[newX][newY]=='L' && !visited[newX][newY]){
                dfs(newX, newY, grid, visited, n, m);
            }
        }
    }
}
