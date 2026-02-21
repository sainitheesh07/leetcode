class Solution {
    int palin(int num){
        int c=0;
        while(num>0){
            if(num%2!=0) c++;
            num/=2;
        }
        return c;
    }
    boolean prime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int d=0;
        for(int i=left;i<=right;i++){
            int res=palin(i);
            if(prime(res)) d++;
        }
        return d;
    }
}