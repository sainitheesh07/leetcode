class Solution {
    public String longestPalindrome(String s) {
        int left=0,right=0;
        for(int i=0;i<s.length();i++){
            int l1=palindrome(s,i,i);
            int l2=palindrome(s,i,i+1);
            int l=Math.max(l1,l2);
            if(l>right-left){
                left=i-(l-1)/2;
                right=i+l/2;
            }
        }
        return s.substring(left,right+1);
    }
    public int palindrome(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}