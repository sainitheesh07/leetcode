class Solution {
    public boolean isPalindromic(String s) {
        String b="";
        for(char c:s.toCharArray()){
            String bin=Integer.toBinaryString(c);
            while(bin.length()<8){
                bin="0"+bin;
            }
            b+=bin;
        }
        int i=0,j=b.length()-1;
        while(i<j){
            if(b.charAt(i)!=b.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}