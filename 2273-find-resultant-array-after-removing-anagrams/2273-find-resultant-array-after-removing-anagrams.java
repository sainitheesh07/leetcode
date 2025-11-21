class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> s=new ArrayList();
        char[] c=words[0].toCharArray();
        Arrays.sort(c);
        s.add(words[0]);
        for(int i=1;i<words.length;i++){
            char[] ch=words[i].toCharArray();
            Arrays.sort(ch);
            if(!Arrays.equals(c,ch)){
                s.add(words[i]);
                c=ch;
            }
        }
        return s;
    }
}