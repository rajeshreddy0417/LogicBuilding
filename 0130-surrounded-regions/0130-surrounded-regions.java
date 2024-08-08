class Pair{
    int i,j;
    public Pair(int i,int j){
        this.i=i;
        this.j=j;
    }
}

class Solution {
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        boolean[][] vis=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                vis[i][j]=false;
            }
        }
        
        Queue<Pair> que=new LinkedList<>();
        
        //adding all the elements having 0 in the last row and col
        for(int i=0;i<m;i++){
            if(board[i][0]=='O'){
                que.add(new Pair(i,0));
            }
            if(board[i][n-1]=='O'){
                que.add(new Pair(i,n-1));
            }
        }
        
        for(int i=0;i<n;i++){
            if(board[0][i]=='O'){
                que.add(new Pair(0,i));
            }
            if(board[m-1][i]=='O'){
                que.add(new Pair(m-1,i));
            }
        }
        
        int[] rr={0,1,0,-1};
        int[] cc={-1,0,1,0};
        
        while(!que.isEmpty()){
            Pair p=que.peek();
            int i1=p.i;
            int j1=p.j;
            que.remove();
            vis[i1][j1]=true;
            for(int l=0;l<4;l++){
                int ni=i1+rr[l];
                int nj=j1+cc[l];
                
                if(ni>=0 && nj>=0 && ni<m && nj<n && board[ni][nj]=='O' && vis[ni][nj]==false){
                    que.add(new Pair(ni,nj));
                }
                
            }           
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]==false){
                    board[i][j]='X';
                }
                else{
                    board[i][j]='O';
                }
            }
        }
        
        
    }
}