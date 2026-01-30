class Solution {
    String palin(String s){
        String t="";
        for(int i=s.length()-1;i>=0;i--){
            t+=s.charAt(i);
        }
        System.out.println(t);
        return t;
    }
    public String firstPalindrome(String[] words) {
        String s="";
        for(int i=0;i<words.length;i++){
            if(words[i].equals(palin(words[i]))){
                s=words[i];
                break;
            }
        }
        return s;
    }
}