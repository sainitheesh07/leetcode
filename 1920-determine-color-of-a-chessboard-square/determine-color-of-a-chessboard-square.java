class Solution {
    public boolean squareIsWhite(String c) {
        int a=c.charAt(0)-'a';
        int b=c.charAt(1)-'0';
        System.out.println(a+b);
        int d=a+b;
        if(d%2!=0) return false;
        else return true;
    }
}