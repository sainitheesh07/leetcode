class Solution {
    public int mirrorDistance(int n) {
        int t=0,a=n;
        while(n>0){
            t=(t*10)+(n%10);
            n/=10;
        }
        return Math.abs(t-a);
    }
}