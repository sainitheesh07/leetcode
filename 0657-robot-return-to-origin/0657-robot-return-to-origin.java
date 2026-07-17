class Solution {
    public boolean judgeCircle(String moves) {
        int t=0,l=0;
        for(int i=0;i<moves.length();i++){
            char c=moves.charAt(i);
            if(c=='U') t++;
            else if(c=='D') t--;
            else if(c=='L') l++;
            else l--;
        }
        return l==0 && t==0;
    }
}