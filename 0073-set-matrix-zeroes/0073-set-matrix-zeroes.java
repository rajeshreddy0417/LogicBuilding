class Pair{
    int i,j;
    public Pair(int i,int j){
        this.i=i;
        this.j=j;
    }
}

class Solution {
    public void setZeroes(int[][] arr) {
        ArrayList<Pair> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    al.add(new Pair(i,j));
                }
            }
        }
        
        for(int i=0;i<al.size();i++){
            for(int j=0;j<arr.length;j++){
                arr[j][al.get(i).j]=0;
            }
            for(int j=0;j<arr[0].length;j++){
                arr[al.get(i).i][j]=0;
            }
        }
    }
}