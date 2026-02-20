class Solution {
    public int titleToNumber(String columnTitle) {
        int s=0,n=columnTitle.length();
        for(int i=0;i<columnTitle.length();i++){
            char c=columnTitle.charAt(i);
            int a=c-'A'+1;
            s+=(a*Math.pow(26,n-1));
            n--;
        }
        return s;
    }
}