class Solution {
    public int reverse(int x) {
        return rev(x);
    }
    public static int rev(int num){
        int res=0;
        while(num!=0){
            if(res>Integer.MAX_VALUE/10 ||res<Integer.MIN_VALUE/10){
                return 0;
            }
            res=res*10+num%10;
            num=num/10;
        }
        return res;
    }
}