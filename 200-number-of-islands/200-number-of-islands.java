class Solution {
    public int numIslands(char[][] grid) {
        int ans =0;
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] arr = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!arr[i][j] && grid[i][j]=='1'){
                    bfs(i,j,arr,grid);
                    ans++;
                }
            }
        }
        return ans;
        
    }
    
    public void bfs(int i,int j,boolean[][] arr,char[][] grid){
        if(i<0 || i>=grid.length){
            return;
        }
        if(j<0 || j>=grid[0].length){
            return;
        }
        if(arr[i][j])
            return;
        if(grid[i][j]=='0')
            return;
        arr[i][j]=true;
        bfs(i-1,j,arr,grid);
        bfs(i,j+1,arr,grid);
        bfs(i+1,j,arr,grid);
        bfs(i,j-1,arr,grid);
    }
}