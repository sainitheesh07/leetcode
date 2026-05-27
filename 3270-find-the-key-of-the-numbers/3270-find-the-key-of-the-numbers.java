class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int min=Integer.MAX_VALUE,s=0,x=1;
        while(num1>0 || num2>0 ||num3>0){
            min=Math.min((num1%10),(num2%10));
            min=Math.min(min,(num3%10));
            s+=(x*min);
            x*=10;
            num1/=10;
            num2/=10;
            num3/=10;
        }
        return s;
    }
}