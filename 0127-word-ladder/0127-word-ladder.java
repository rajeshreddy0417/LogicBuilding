class Pair{
    String str;
    int steps;
    public Pair(String str,int steps){
        this.str=str;
        this.steps=steps;
    }
}
class Solution {
    public int ladderLength(String s, String e, List<String> wordList) {
        Set<String> set=new HashSet<>();
        for(int i=0;i<wordList.size();i++){
            set.add(wordList.get(i));
        }
        
        Queue<Pair> que=new LinkedList<>();
        que.add(new Pair(s,1));
        set.remove(s);
        while(!que.isEmpty()){
            String curr=que.peek().str;
            int size=que.peek().steps;
            que.remove();
            if(curr.equals(e)==true){
                return size;
            }
            
            for(int i=0;i<curr.length();i++){
                for(char ch='a';ch<='z';ch++){
                    char[] wordarr=curr.toCharArray();
                    wordarr[i]=ch;
                    String newword=new String(wordarr);
                    if(set.contains(newword)){
                        set.remove(newword);
                        que.add(new Pair(newword,size+1));
                    }
                }
            }
        }
        
        System.out.println(set);
        return 0;
    }
}