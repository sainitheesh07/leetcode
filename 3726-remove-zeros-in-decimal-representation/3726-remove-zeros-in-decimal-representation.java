class Solution {
    public long removeZeros(long n) {
        long s=0,r=0;
        while(n>0){
            r=n%10;
            if(r!=0) s=(s*10)+r;
            n/=10;
        }
        long t=0;
        while(s>0){
            r=s%10;
            t=(t*10)+r;
            s/=10;
        }
        return t;
    }
}