class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}

class Solution {
    public int numIslands(char[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        int[][] vis=new int[m][n];
        
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]==0 && grid[i][j]=='1'){
                    count++;
                    BFS(i,j,grid,vis);
                }
            }
        }
        return count;
    }
    
    public static void BFS(int i,int j,char[][] grid,int[][] vis){
        vis[i][j]=1;
        Queue<Pair> que=new LinkedList<Pair>();
        que.add(new Pair(i,j));
        int m=grid.length;
        int n=grid[0].length;
        
        int[] rowDir = {-1, 1, 0, 0};
        int[] colDir = {0, 0, -1, 1};
        
        while(!que.isEmpty()){
            int r1=que.peek().first;
            int c1=que.peek().second;
            que.remove();
            for (int d = 0; d < 4; d++) {
                int rcurr = r1 + rowDir[d];
                int ccurr = c1 + colDir[d];
                
                
                if(rcurr>=0 && rcurr<m && ccurr>=0 && ccurr<n && grid[rcurr][ccurr]=='1' && vis[rcurr][ccurr]==0){
                    vis[rcurr][ccurr]=1;
                    que.add(new Pair(rcurr,ccurr));
                }
            }
        
        }
        
        
    }
    
}

        