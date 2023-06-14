class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];    
                
                
            }
            arr[i]=sum; 
        }
        
        
        int maxx=big(arr);
        //System.out.println(maxx);
        return maxx;
        
        
        
        
    }
    static int big(int[] arr){
        int max=arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    
}