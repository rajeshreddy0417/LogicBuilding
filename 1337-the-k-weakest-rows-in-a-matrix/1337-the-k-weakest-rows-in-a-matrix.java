class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        
        int[] arr=new int[mat.length];
        for(int i=0;i<mat.length;i++){
            int count=0;
            //System.out.println(Arrays.toString(mat[i]));
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    count++;    
                }
            }
            m.put(i,count);
            arr[i]=count;
        }
        //System.out.println(m);
       // System.out.println(Arrays.toString(arr));
        
        
        int max=0;
        for(int i=0;i<mat.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }  
        }
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        //System.out.println(Arrays.toString(arr));
        
       
        
       
      int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
                if (arr[i] == entry.getValue()) {
                    result[i] = entry.getKey();
                    m.remove(entry.getKey());
                    break;
                }
            }
        }

        return result;
        

    }
}