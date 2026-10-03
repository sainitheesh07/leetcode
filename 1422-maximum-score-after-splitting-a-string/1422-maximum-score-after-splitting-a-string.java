class Solution {
    public int maxScore(String s) { 
        int m=Integer.MIN_VALUE,l=0,t=0;
        for(char c:s.toCharArray()){
            if(c=='1') t++;
        }
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0') l++;
            else t--;
            System.out.println(l+" "+t);
            m=Math.max(m,t+l);
        }
        return m;
    }
}