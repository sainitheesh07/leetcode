class Solution {
    public int countVowelSubstrings(String word) {
        HashSet<Character> hs=new HashSet<>();
        int t=0;
        for(int i=0;i<word.length();i++){
            hs.clear();
            for(int j=i;j<word.length();j++){
                char c=word.charAt(j);
                if(c=='a'||c=='o'||c=='i'||c=='e'||c=='u'){
                    hs.add(c);
                    if(hs.size()>=5) t++;
                }
                else break;
            }
        }
        return t;
    }
}