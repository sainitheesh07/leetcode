class Solution {
    public int passwordStrength(String password) {
        int l=password.length(),t=0;
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<l;i++){
            char c=password.charAt(i);
            if(c>=65 && c<=90 &&(!hs.contains(c))) t+=2;
            if(c>=97 && c<=122 && (!hs.contains(c))) t+=1;
            if(c>=48 && c<=57 && (!hs.contains(c))) t+=3;
            if((c=='!'||c=='@' ||c=='#' ||c=='$') && (!hs.contains(c))) t+=5;
            hs.add(c);
        }
        return t;
    }
}