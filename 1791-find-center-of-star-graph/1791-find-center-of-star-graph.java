class Solution {
    public int findCenter(int[][] edges) {
        int u=edges[0][0];
        int v=edges[0][1];
        for(int i=1;i<edges.length;i++){
            if(edges[i][0]!=u && edges[i][1]!=u){
                u=0;
            }
            if(edges[i][1]!=v && edges[i][0]!=v){
                v=0;
            }
        }
        if(u!=0){
            return u;
        }else{
            return v;
        }
    }
}