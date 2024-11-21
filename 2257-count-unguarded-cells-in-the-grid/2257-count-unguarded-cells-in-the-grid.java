class Pair{
    int row,col;
    public Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        //0->g(red)
        //1->w(green)
        int[][] grid=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(grid[i],-1);
        }
        //Queue<Pair> que=new LinkedList<>();
        for(int i=0;i<walls.length;i++){
            grid[walls[i][0]][walls[i][1]]=1;
        }
        for(int i=0;i<guards.length;i++){
            grid[guards[i][0]][guards[i][1]]=0;
            //que.add(new Pair(guards[i][0],guards[i][1]));
        }
        //int[] rr={-1,0,1,0};
        //int[] cc={0,1,0,-1};
        
        //while(!que.isEmpty()){
            //Pair p=que.poll();
        for(int[] p:guards){
            int r=p[0];
            int c=p[1];
            
            //top check
            //if(r>0){
                for(int i=r-1;i>=0;i--){
                    if(grid[i][c]==1 || grid[i][c]==0){
                        break;
                        
                    }
                    grid[i][c]=2;
                }
            //}
            
            //bottom check
            for(int i=r+1;i<m;i++){
                if(grid[i][c]==1 || grid[i][c]==0){
                    break;
                }
                grid[i][c]=2;
            }
            
            //left check
            for(int i=c-1;i>=0;i--){
                if(grid[r][i]==1 || grid[r][i]==0){
                    break;
                }
                grid[r][i]=2;
            }
            
            //right check
            for(int i=c+1;i<n;i++){
                if(grid[r][i]==1 || grid[r][i]==0){
                    break;
                }
                grid[r][i]=2;
            }
        }
        
        
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==-1){
                    ans++;
                }
            }
        }
        return ans;
    }
}