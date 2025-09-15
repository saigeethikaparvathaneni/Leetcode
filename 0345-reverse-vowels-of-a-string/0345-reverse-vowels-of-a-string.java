class Solution {
    public String reverseVowels(String s) {
      char arr[]=s.toCharArray();
      int l=0,r=s.length()-1;
      while(l<r){
        while( r>l && arr[r]!='a'&&arr[r]!='e'&& arr[r]!='i'&& arr[r]!='o' && arr[r]!='U'&& arr[r]!='A'&& arr[r]!='E'&& arr[r]!='I'&& arr[r]!='O'&& arr[r]!='U'){
            r--;
        }
        while(l<r && arr[l]!='a'&& arr[l]!='e'&& arr[l]!='i'&& arr[l]!='o'&& arr[l]!='U'&& arr[l]!='A'&& arr[l]!='E'&& arr[l]!='I'&& arr[l]!='O'&& arr[l]!='U'){
            l++;
        }

          char c=arr[l];
          arr[l]=arr[r];
          arr[r]=c;
          l++;
          r--;
   
      }
      String a=new String(arr);
      return a;  
    }
}