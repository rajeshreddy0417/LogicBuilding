class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> id=new ArrayList<>();
        ArrayList<Integer> jd=new ArrayList<>();
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    id.add(i);
                    jd.add(j);
                }
            }
        }
        
        System.out.println(id);
        System.out.println(jd);
        
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(id.contains(i) || jd.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
        
        
    }
    
    
}