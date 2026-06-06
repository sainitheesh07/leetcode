class Solution {
    public int reverse(int num){
        int s=0;
        while(num>0){
            int r=num%10;
            s=(s*10)+r;
            num/=10;
        }
        return s;
    }
    public boolean prime(int n){
        int t=0;
        for(int i=2;i<=n;i++){
            if(n%i==0) t++;
        }
        return t==1;
    }
    public int sumOfPrimesInRange(int n) {
        int s=0,num=reverse(n);
        for(int i=Math.min(n,num);i<=Math.max(n,num);i++){
            if(prime(i)) s+=i;
        }
        return s;
    }
}