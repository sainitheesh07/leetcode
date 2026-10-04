class Solution {
    public int minRotations(String s) {
        int t=0,b=s.charAt(0)-'0';
        if(s.charAt(0)!='0') t+=Math.min(b,10-b);
        for(int i=0;i<s.length()-1;i++){
            int a=Math.abs(s.charAt(i)-'0'-(s.charAt(i+1)-'0'));
            t+=Math.min(a,10-a);
        }
        return t;
    }
}