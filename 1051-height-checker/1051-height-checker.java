class Solution {
    public int heightChecker(int[] heights) {
        int[] ori=heights.clone();
        System.out.println(Arrays.toString(ori));
        int count=0;
        Arrays.sort(heights);
        System.out.println(Arrays.toString(ori));
        for(int i=0;i<ori.length;i++){
            if(ori[i]!=heights[i]){
                count=count+1;;
            }
        }
        return count;
    }
}