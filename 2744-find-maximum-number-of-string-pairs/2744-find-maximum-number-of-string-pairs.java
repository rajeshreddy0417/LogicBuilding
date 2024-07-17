class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int ans=0;
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<words.length;i++){
            if(hs.contains(words[i])){
                // System.out.println(ans);
                ans++;
            }
            else{
                String temp="";
                for(int j=0;j<words[i].length();j++){
                    char c=words[i].charAt(j);
                    temp=c+temp;
                }
                hs.add(temp);
            }
        }
        return ans;
    }
}