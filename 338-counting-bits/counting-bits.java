class Solution {
    public int[] countBits(int n) {
        int brr[]=new int[n+1];
        for(int i=0;i<=n;i++){
            brr[i]=Integer.bitCount(i);
        }
        return brr;
    }
}