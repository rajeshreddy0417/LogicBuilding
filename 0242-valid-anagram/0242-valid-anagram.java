class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm= new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),1);
            }
            else if(hm.containsKey(s.charAt(i))){
                int temp=hm.get(s.charAt(i));
                hm.replace(s.charAt(i),temp+1);
            }
        }
        
        System.out.println(hm);
        
        for(int i=0;i<t.length();i++){
            if(!hm.containsKey(t.charAt(i)) || hm.get(t.charAt(i))==0){
                return false;
            }
            hm.put(t.charAt(i),hm.get(t.charAt(i))-1);
        }
        
        System.out.println(hm);
        
        for(int c:hm.values()){
            if(c!=0){
                return false;
            }
        }
        
        return true;
    }
}