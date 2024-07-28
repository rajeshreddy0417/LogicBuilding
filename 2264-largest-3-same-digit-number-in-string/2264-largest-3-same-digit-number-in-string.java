class Solution {
    public String largestGoodInteger(String num) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<num.length()-2;i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i+1)==num.charAt(i+2)){
                if(max<Integer.parseInt(String.valueOf(num.charAt(i)))){
                    System.out.println(num.charAt(i));
                    max=Integer.parseInt(String.valueOf(num.charAt(i)));  
                    System.out.println(max);

                }
            }
        }
        //System.out.println(max);
        String ans="";
        if(max!=Integer.MIN_VALUE){
        for(int i=0;i<3;i++){
            ans=ans+max;
        }
        }
        return ans;
    }
}