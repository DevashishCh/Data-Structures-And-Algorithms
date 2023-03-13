class Solution {
    private void dfs(int row,int col,char[][] board,int[][] vis,int delrow[],int delcol[]){
        int m=board.length;
        int n=board[0].length;
        vis[row][col]=1;
        //neighbours
        for(int i=0;i<4;i++){
            int nrow=row+delrow[i];
            int ncol=col+delcol[i];
            //validation
            if(nrow>=0  && ncol>=0 && nrow<m && ncol<n && board[nrow][ncol]=='O' && vis[nrow][ncol]==0 )
                dfs(nrow,ncol,board,vis,delrow,delcol);
        }
    }
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        int[][] vis = new int[m][n];
        int delrow[]={-1,1,0,0};
        int delcol[]={0,0,-1,1};
        
        //l&r
        for(int i=0;i<m;i++){
            if(board[i][0]=='O' && vis[i][0]==0)
                dfs(i,0,board,vis,delrow,delcol);
            
            if(board[i][n-1]=='O' && vis[i][n-1]==0)
                dfs(i,n-1,board,vis,delrow,delcol);
            
        }
        
        // u&d
        for(int j=0;j<n;j++){
            if(board[0][j]=='O' && vis[0][j]==0)
                dfs(0,j,board,vis,delrow,delcol);
            
             if(board[m-1][j]=='O' && vis[m-1][j]==0)
                dfs(m-1,j,board,vis,delrow,delcol);
            
        }
        
        //filling remaining 0's
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O' && vis[i][j]==0)
                    board[i][j]='X';
            }
        }
        
    }
}