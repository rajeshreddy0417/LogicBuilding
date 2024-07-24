class Solution {
    public int subtractProductAndSum(int n) {
        int m=1;
        int a=0;
        int num=n;
        while(num>0){
            int temp=num%10;
            m=m*temp;
            a=a+temp;
            num=num/10;
        }
        return m-a;
    }
}