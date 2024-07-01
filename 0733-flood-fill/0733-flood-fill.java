//DFS approach

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length;
        int n=image[0].length;
        if(image[sr][sc]==color){
            return image;
        }
        
        DFS(sr,sc,image,color,image[sr][sc]);
        return image;
    }
    
    public static void DFS(int i,int j,int[][] image,int color,int ins){
        int[] rw={-1,0,0,1};
        int[] cw={0,-1,1,0};
        image[i][j]=color;
        for(int l=0;l<rw.length;l++){
            int row=i+rw[l];
            int col=j+cw[l];
            
            if(row>=0 && col>=0 && row<image.length && col<image[0].length && image[row][col]==ins){
                DFS(row,col,image,color,ins);
            }
            
            
        }
    }
    
}