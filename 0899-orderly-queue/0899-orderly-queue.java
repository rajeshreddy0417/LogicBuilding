class Solution {
    public String orderlyQueue(String s, int k) {
        StringBuilder sb=new StringBuilder(s);
        if(k>1){
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            return new String(arr);
        }
        String temp=s;
        if(k==1){
            for(int i=1;i<s.length();i++){
                sb.append(sb.charAt(0));
                sb.deleteCharAt(0);
                if(sb.toString().compareTo(temp)<0){
                    temp=sb.toString();
                }
            }
            
        }
        return temp;
    }
}