class Solution {
    public String reverseVowels(String s) {
        int s1=0;
        int e=s.length()-1;
        if(s.length()==0 || s.length()==1){
            return s;
        }
        char[] arr=s.toCharArray();
        HashSet<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        while(e>s1){
            if(!set.contains(s.charAt(s1))){
                s1++;
            }
            else if(!set.contains(s.charAt(e))){
                e--;
            }
            else{
            char temp=arr[s1];
            arr[s1]=arr[e];
            arr[e]=temp;
            s1++;
            e--;
            }
            
        }

        System.out.println(Arrays.toString(arr));
        return new String(arr);
    }
}