class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] ch={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> hs=new HashSet<>();
        String[] c=new String [words.length];
        for(int i=0;i<words.length;i++){
            String s=words[i];
            for(int j=0;j<s.length();j++){
                char ca=s.charAt(j);
                c[i]+=ch[ca-'a'];
            }
            hs.add(c[i]);
        }
        return hs.size();
    }
}