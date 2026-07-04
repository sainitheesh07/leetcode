class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder t=new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(j<spaces.length && i==spaces[j]){
                t.append(' ');
                j++;
            }
            t.append(c);
        }
        return t.toString();
    }
}