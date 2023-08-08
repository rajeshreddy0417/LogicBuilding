class Solution {
    public int addDigits(int num) {
        String s=Integer.toString(num);
        int l=s.length();
        if(num<10){
            return num;
        }
        int sum=0;
        for(int i=0;i<l;i++){
            int r=num%10;
            num=num/10;
            sum=sum+r;
        }
        return addDigits(sum);
        }
        
        
        
    }
