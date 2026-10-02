import java.util.*;
class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int a=0;
        List<Integer> lt=new ArrayList<>();
        for(int i=0;i<n;i++){
            a=a+nums[i];
            lt.add(a);
        }
        int arr[]=new int[lt.size()];
        for(int i=0;i<lt.size();i++){
            arr[i]+=lt.get(i);
        }
        return arr;
    }
}