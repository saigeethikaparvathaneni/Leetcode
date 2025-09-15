class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l=0;
        int count=0;
        int r=1,a=flowerbed.length;
        int prev1=0;
 
        while(r<=a){
            int prev=flowerbed[l];
          int next = (r < a) ? flowerbed[r] : 0;  
         if(prev==0 && next==0 && prev1==0){
           flowerbed[l]=1;
           //b=true;
           n--;
          count++;
         }
         prev1=flowerbed[l];
         l++;
         r++;
        }
        if(n<=0)
        return true;
        return false;
    }
}

  
       


   
  


 
    
