class Solution {
    public int passwordStrength(String password) {
        int l=password.length(),t=0;
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<l;i++){
            char c=password.charAt(i);
            if(hs.contains(c)) continue;
            hs.add(c);
            if(c>=65 && c<=90) t+=2;
            else if(c>=97 && c<=122) t+=1;
            else if(c>=48 && c<=57) t+=3;
            else t+=5;
        }
        return t;
    }
}