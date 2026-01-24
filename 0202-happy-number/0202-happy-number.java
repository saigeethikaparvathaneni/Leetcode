class Solution {
    public int square(int n){
        int sum=0;
        while(n!=0){
            int d = n%10;
            d=d*d;
            sum+=d;
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int new1 = square(n);
        while(new1!=1 && new1!=4){
            new1=square(new1);
        }
        return new1==1;



        }
        
    }
