class Solution {
    public int minLength(String s) {
        if(s.length()<2){
            return s.length();
        }
        List<Character> arr=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            arr.add(s.charAt(i));
        }
        int prev;
        do{
            prev=arr.size();
            for(int i=1;i<arr.size();i++){
                if((arr.get(i-1)=='A' && arr.get(i)=='B') || (arr.get(i-1)=='C' && arr.get(i)=='D')){
                    arr.remove(i-1);
                    arr.remove(i-1);
                    i--;
                }
                
            }
            //System.out.println(arr);
        }while(prev!=arr.size());
        return arr.size();
    }
}