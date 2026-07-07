class Solution {
    public long sumAndMultiply(int n) {
        if(n==0) return 0;
        StringBuilder t=new StringBuilder();
        while(n>0){
            if(n%10!=0){
                t.append(n%10);
                n/=10;
            }
            else n/=10;
        }
        String s=t.reverse().toString();
        long total=0;
        for(char c:s.toCharArray()){
            total+=(c-'0');
        }
        return total*(Integer.parseInt(s));
    }
}