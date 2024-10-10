class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> al=new ArrayList<>();
        String[] arr=text.split(" ");
        for(int i=0;i<arr.length-2;i++){
            if(arr[i].equals(first) && arr[i+1].equals(second)){
                //System.out.println(1);
                al.add(arr[i+2]);
            }
        }
        String[] ans=new String[al.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=al.get(i);
        }
        //System.out.println(al);
        return ans;
    }
}