class Solution {
    public int countAsterisks(String s) {
        int count=0,t=0;
        for(char c:s.toCharArray()){
            if(c=='|') t++;
            if(t%2==0 && c=='*') count++;
        }
        return count;
    }
}