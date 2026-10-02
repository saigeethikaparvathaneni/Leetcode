class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=2;
        List<Integer> lt=new ArrayList<>();
        while(n>0){
            for(int i=0;i<nums.length;i++){
            lt.add(nums[i]);
            }
            n--;
        }
         int arr[]=new int[lt.size()];
         for(int i=0;i<lt.size();i++){
            arr[i]+=lt.get(i);
         }
         return arr;
    }
}