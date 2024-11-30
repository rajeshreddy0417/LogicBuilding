class Solution {
    public boolean canAliceWin(int n) {
        boolean flag=false;;
        int pickes=10;
        
        while(n>=pickes){
            flag=!flag;
            n=n-pickes;
            pickes=pickes-1;
        }
        return flag;
    }
}