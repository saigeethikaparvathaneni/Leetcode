class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> lst=new ArrayList<>();
        int max=candies[0];
        for(int i=0;i<candies.length;i++){
            if(max<candies[i])
            max=candies[i];
        }
        for(int i=0;i<candies.length;i++){
           int s=candies[i]+extraCandies;
           if(s>=max)
           lst.add(true);
           else
           lst.add(false);
        }
        return lst;
    }
}