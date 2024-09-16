class Solution {
    public int findMinDifference(List<String> time) {
        List<Integer> min=new ArrayList<>();
        for(int i=0;i<time.size();i++){
            int h=Integer.parseInt(time.get(i).substring(0,2));
            int m=Integer.parseInt(time.get(i).substring(3));
            min.add(h*60+m);
            //System.out.println(min);
        }
        Collections.sort(min);
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<min.size();i++){
            ans=Math.min(ans,min.get(i)-min.get(i-1));
        }
        return Math.min(ans,24*60-min.get(min.size()-1)+min.get(0));
        
    }
}