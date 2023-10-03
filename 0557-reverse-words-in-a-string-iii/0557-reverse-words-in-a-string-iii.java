class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();

        String[] arr=s.split(" ");

        String[] arr1=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            sb.append(rev(arr[i])+' ');
        }
        sb.deleteCharAt(sb.length()-1);

        //System.out.println(sb);
        String str=sb.toString();
        return str;
    }
    public static String rev(String str){
        int l=str.length();
        char[] ca=new char[str.length()];
        for(int i=0;i<l;i++){
            ca[l-1-i]=str.charAt(i);
        }
        String s=new String(ca);
        //System.out.println(s);
        return s;
    }
    
}
