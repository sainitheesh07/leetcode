class Solution {
    public boolean checkString(String s) {
        int t=0,l=0;
        for(char c:s.toCharArray()) if(c=='a') t++;
        System.out.println(t);
        for(int i=0;i<t;i++) if(s.charAt(i)=='a') l++;
        System.out.println(l);
        return t==l;
    }
}