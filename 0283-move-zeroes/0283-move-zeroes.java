class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=0;
        int temp=0;
        while(r<n && l<=r){
            if(nums[r]!=0){
           temp=nums[l];
           nums[l]=nums[r];
           nums[r]=temp;
           l++;
            }
              r++;
        }
    }
}