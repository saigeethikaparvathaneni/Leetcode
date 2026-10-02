class Solution {
    public int maximumWealth(int[][] accounts) {
        List<Integer> lt=new ArrayList<>();
        int n=accounts.length;
       for(int i=0;i<n;i++){
        int s=0;
        for(int j=0;j<accounts[i].length;j++){
             s+=accounts[i][j];
        }
        lt.add(s);
       } 
       int max=lt.get(0);
       for(int k=0;k<lt.size();k++){
           if(max<lt.get(k)){
            max=lt.get(k);
           }
       }
       return max;
    }
}