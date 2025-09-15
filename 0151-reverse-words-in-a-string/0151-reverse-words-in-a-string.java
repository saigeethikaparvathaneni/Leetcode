class Solution {
    public String reverseWords(String s) {
       StringBuilder res=new StringBuilder();
       String str[]=s.trim().split("\\s+");
       for(int i=str.length-1;i>=0;i--){
        res.append(str[i]);
        if(i>0)
        res.append(" ");
       }
       return res.toString();
    }
}