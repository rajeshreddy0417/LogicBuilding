class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] copy=arr.clone();
        Arrays.sort(copy);
        HashMap<Integer,Integer> hm=new HashMap<>();
        int rank=1;
        for(int i=0;i<copy.length;i++){
            if(!hm.containsKey(copy[i])){
                hm.put(copy[i],rank++);
            }
        }
        
        for(int i=0;i<copy.length;i++){
            arr[i]=hm.get(arr[i]);
        }
        //System.out.println(copy);
        return arr;
    }
}