class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.split(" ");
        int l=arr.length;
        String ls=arr[l-1];
        int res=ls.length();
        return res;
    }
}