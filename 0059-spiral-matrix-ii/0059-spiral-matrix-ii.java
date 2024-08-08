class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        
        int l=0;
        int r=n-1;
        int t=0;
        int b=n-1;
        
        int q=1;
        int a=n*n;
        while(q<a+1){
            //--->
            for(int i=l;i<=r;i++){
                arr[t][i]=q;
                q++;
            }
            t++;
            //down
            for(int i=t;i<=b;i++){
                arr[i][r]=q;
                q++;
            }
            r--;
            //<--
            for(int i=r;i>=l;i--){
                arr[b][i]=q;
                
                q++;
            }
            b--;
            //up
            for(int i=b;i>=t;i--){
                arr[i][l]=q;
                q++;
            }
            l++;
        }
        
        
        return arr;
    }
}