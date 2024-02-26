class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)){
            return 0;
        }
        
        Set<String> set=new HashSet<>();
        Queue<String> que=new LinkedList<>();
        que.offer(beginWord);
        int len=1;
        
        while(!que.isEmpty()){
            int size=que.size();
            for(int i=0;i<size;i++){
                String curr=que.poll();
            if(curr.equals(endWord)){
                return len;
            }
            for(String word:wordList){
                if(fun(curr,word,0) && !set.contains(word)){
                    que.offer(word);
                    set.add(word);
                }
            }
            }
        len++;
        }
        return 0;        
    }
    public boolean fun(String m,String s,int count){
        for(int i=0;i<m.length();i++){
            if(m.charAt(i)!=s.charAt(i)){
                count++;
                if(count>1){
                    return false;
                }
            }
        }
        return count==1;
    }
}