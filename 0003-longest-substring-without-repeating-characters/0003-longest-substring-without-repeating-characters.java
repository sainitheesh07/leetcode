class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int l=0,a=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!hs.contains(c)) hs.add(c);
            else{
                while(hs.contains(c)){
                    hs.remove(s.charAt(l));
                    l++;
                }
                hs.add(c);
            }
            a=Math.max(a,i-l+1);
        }
        return a;
    }
}