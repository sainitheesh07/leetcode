class Solution {
    public String[] findWords(String[] words) {
        List<String> l=new ArrayList<>();
        HashSet<Character> l1=new HashSet<>();
        HashSet<Character> l2 = new HashSet<>();
        HashSet<Character> l3 = new HashSet<>();
        String s1="qwertyuiopQWERTYUIOP";
        String s2="asdfghjklASDFGHJKL";
        String s3="zxcvbnmZXCVBNM";
        for(char c:s1.toCharArray()){
            l1.add(c);
        }
        for(char c:s2.toCharArray()){
            l2.add(c);
        }
        for(char c:s3.toCharArray()){
            l3.add(c);
        }
        for(int i=0;i<words.length;i++){
            int x1=0,x2=0,x3=0;
            String s=words[i];
            int n=s.length();
            for(int j=0;j<n;j++){
                if(l1.contains(s.charAt(j))) x1++;
                if(l2.contains(s.charAt(j))) x2++;
                if(l3.contains(s.charAt(j))) x3++;
            }
            if(x1==n || x2==n || x3==n) l.add(s);
        }
        return l.toArray(new String[l.size()]);
    }
}