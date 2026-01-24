class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int l1=g.length;
        int l2=s.length;
        int l = 0;
        int r = 0;
        int c = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(l<l1 && r<l2){
            if(s[r]>=g[l]){
                c++;
                l++;
                r++;
            }
            else{
                r++;
            }
        }
        return c;

   
    }
}