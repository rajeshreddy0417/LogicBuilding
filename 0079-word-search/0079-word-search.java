class Solution {
    public boolean exist(char[][] arr, String s) {
        boolean ans=false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==s.charAt(0)){
                    ans=fun(arr,s,i,j,0);
                    if(ans==true){
                        return true;
                    }
                }
            }
        }
        return ans;
    }
    private boolean fun(char[][] arr,String s,int i,int j,int a){
        if(a==s.length()){
            return true;
        }
        
        if (i < 0 || i >= arr.length || j < 0 || j >= arr[0].length || arr[i][j] != s.charAt(a)) {
            return false;
        }
        
         char temp = arr[i][j];
        arr[i][j] = '/';
        
        
        boolean result=fun(arr,s,i+1,j,a+1) || fun(arr,s,i,j+1,a+1) || fun(arr,s,i-1,j,a+1) || fun(arr,s,i,j-1,a+1);
        
        arr[i][j]=temp;
                        
      return result;
    }
}