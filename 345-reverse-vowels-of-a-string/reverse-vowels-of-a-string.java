class Solution {
    public String reverseVowels(String s) {
        char arr[]=s.toCharArray();
        int l=0;
        int r=s.length()-1;
        String s1="aeiouAEIOU";
        while(l<r){
            while( r>l && (s1.indexOf(arr[r])==-1)){
            r--;
            }
            while(l<r && (s1.indexOf(arr[l])==-1)){
             l++;
            }
          char c=arr[l];
          arr[l]=arr[r];
          arr[r]=c;
          l++;
          r--;
        }
        return new String(arr);
    }
}