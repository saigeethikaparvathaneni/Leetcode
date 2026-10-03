class Solution {
    public void sort(int arr[]){
      int n=arr.length,t=0;
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
              t=arr[i];
             arr[i]=arr[j];
             arr[j]=t;
             
            }
        }
        
      }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    List<Integer> lt=new ArrayList<>();
    for(int i=0;i<m;i++){
        lt.add(nums1[i]);
    }
    for(int j=0;j<n;j++){
        lt.add(nums2[j]);
    }
    int brr[]=new int[lt.size()];
    for(int i=0;i<lt.size();i++){
        brr[i]=lt.get(i);
    }
    sort(brr);
    for(int i=0;i<brr.length;i++){
        nums1[i]=brr[i];
    }
    
    }
}