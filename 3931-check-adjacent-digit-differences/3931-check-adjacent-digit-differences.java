class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i=0;i<s.length()-1;i++){
            char c=s.charAt(i);
            char ch=s.charAt(i+1);
            int a=(int)Math.abs(c-ch);
            if(a>2) return false; 
        }
        return true;
    }
}