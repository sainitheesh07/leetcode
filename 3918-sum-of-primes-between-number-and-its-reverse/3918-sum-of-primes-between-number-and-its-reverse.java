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
        int s=0,a=0,b=0,num=reverse(n);
        if(n>num){
            a=n;
            b=num;
        }
        else{
            a=num;
            b=n;
        }
        System.out.println(a+" "+b);
        for(int i=b;i<=a;i++){
            if(prime(i)) s+=i;
        }
        return s;
    }
}