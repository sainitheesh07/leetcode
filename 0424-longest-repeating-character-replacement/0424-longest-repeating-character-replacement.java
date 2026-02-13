class Solution {
    public int characterReplacement(String s, int k) {
        int maxocc=1,i=0,j=0,maxlen=0,n=s.length();
        char maxchar=s.charAt(0);
        HashMap<Character,Integer> hp=new HashMap<>();
        for(j=0;j<n;j++){
                char c=s.charAt(j);
                hp.put(c,hp.getOrDefault(c,0)+1);
                if(maxocc<hp.get(c)){
                    maxocc=hp.get(c);
                    maxchar=c;
                }
                while((j-i+1)-maxocc>k){
                    char ichar=s.charAt(i);
                    hp.put(ichar,hp.get(ichar)-1);
                    i++;
                    if(maxocc==ichar){
                        maxocc=hp.get(ichar);
                    }
                }
                maxlen=Math.max(maxlen,j-i+1);
            }
            return maxlen;
    }
}