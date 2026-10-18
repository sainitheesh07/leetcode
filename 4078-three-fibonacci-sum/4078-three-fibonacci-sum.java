class Solution {
    public boolean threeFibonacciSum(int n) {
        int a=0,b=1;
        int c=a+b;
        while(c<=n){
            if(2*c==n) return true;
            a=b;
            b=c;
            c=a+b;
        }
        return false;
    }
}