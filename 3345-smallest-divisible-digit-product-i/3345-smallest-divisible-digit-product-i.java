class Solution {
    public int smallestNumber(int n, int t) {
        if(n>=10){
            if(((n/10)*(n%10))%t==0) return n;
            else return smallestNumber(n+1,t);
        }
        else{
            if(n%t==0) return n;
            else return smallestNumber(n+1,t);
        }
    }
}