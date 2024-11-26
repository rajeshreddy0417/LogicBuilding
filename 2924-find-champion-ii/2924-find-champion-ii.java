class Solution {
    public int findChampion(int n, int[][] edges) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<edges.length;i++){
            set.add(edges[i][1]);
        }
        int count=0;
        int ans=-1;
        for(int i=0;i<n;i++){
            if(!set.contains(i)){
                if(count==0){
                    count=1;
                    ans=i;
                }else{
                    return -1;
                }
            }
        }
        return ans;
    }
}