class Solution {
    public boolean validDigit(int n, int x) {
        int c=0;
        while(n>=10){
            int r=n%10;
            if(r==x) c++;
            n/=10;
        }
        if(n%10==x) return false;
        return c>=1;
    }
}