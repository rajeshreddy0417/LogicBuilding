
class Disjoint{
    ArrayList<Integer> par=new ArrayList<>();
    ArrayList<Integer> rank=new ArrayList<>();
    
    public Disjoint(int n){
        for(int i=0;i<n;i++){
            par.add(i);
            rank.add(0);
        }
    }
    
    public int getpar(int node){
        if(node==par.get(node)){
            return node;
        }
        int ulp=getpar(par.get(node));
        par.set(node,ulp);
        return ulp;
    }
    
    public void union(int u,int v){
        int ulp_u=getpar(u);
        int ulp_v=getpar(v);
        
        int ru=rank.get(u);
        int rv=rank.get(v);
        if(rv>ru){
            par.set(ulp_u,ulp_v);
        }
        else if(ru>rv){
            par.set(ulp_v,ulp_u);
        }else{
            par.set(ulp_u,ulp_v);
            int r=rank.get(ulp_v);
            rank.set(v,r+1);
        }
    }
}

class Solution {
    public int findCircleNum(int[][] mat) {
        Disjoint ds=new Disjoint(mat.length);
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && mat[i][j]==1){
                    ds.union(i,j);
                }
            }
        }
        int count=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            int p=ds.getpar(i);
            if(!hs.contains(p)){
                hs.add(p);
                count++;
            }
        }
        return count;
    }
}