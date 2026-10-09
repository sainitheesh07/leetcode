class Solution {
    public String reverseByType(String s) {
        String res="";
        StringBuilder alp=new StringBuilder();
        StringBuilder spe=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)) alp.append(c);
            if(!Character.isLetterOrDigit(c)) spe.append(c);
        }
        String a=alp.reverse().toString(),b=spe.reverse().toString();
        int i=0,j=0;
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)) res+=a.charAt(i++);
            if(!Character.isLetterOrDigit(c)) res+=b.charAt(j++);
        }
        return res;
    }
}