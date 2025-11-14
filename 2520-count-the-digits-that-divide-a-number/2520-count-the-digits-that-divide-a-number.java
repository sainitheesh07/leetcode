class Solution {
    public int countDigits(int num) {
        int r,c=0,a;
        a=num;
        while(a>0){
            r=a%10;
            if(num%r==0) c++;
            a/=10;
        }
        return c;
    }
}