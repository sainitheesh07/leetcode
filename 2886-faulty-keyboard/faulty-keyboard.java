class Solution {
    public String finalString(String s) {
        StringBuilder p=new StringBuilder();
       
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!='i') p.append(c);
            else{
                p.reverse();
            }
        }
        return p.toString();
    }
}