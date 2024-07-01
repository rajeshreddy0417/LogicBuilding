class Pair{
    int row;
    int col;
    public Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int a=image[sr][sc];
        int m=image.length;
        int n=image[0].length;
        if(image[sr][sc]==color){
            return image;
        }
        
        Queue<Pair> que=new LinkedList<Pair>();
        que.add(new Pair(sr,sc));
        
        while(!que.isEmpty()){
            int r=que.peek().row;
            int c=que.peek().col;
            image[r][c]=color;
            que.remove();
            
            int[] rr={-1,0,0,1};
            int[] cc={0,-1,+1,0};
            
            for(int l=0;l<rr.length;l++){
                int i=r+rr[l];
                int j=c+cc[l];
            
            
            if(i>=0 && j>=0 && i<m && j<n && image[i][j]==a){
                que.add(new Pair(i,j));
            }
            }
        }
        return image;
    }
}