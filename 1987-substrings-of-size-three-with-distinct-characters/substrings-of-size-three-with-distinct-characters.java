class Solution {
    public boolean fun(String s){
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            hs.add(s.charAt(i));
        }
        return hs.size() == 3;
    }
    public int countGoodSubstrings(String s) {
        int t=0;
        for(int i=0;i<s.length()-2;i++){
            char c=s.charAt(i);
            if(fun(s.substring(i,i+3))) t++;
        }
        return t;
    }
}