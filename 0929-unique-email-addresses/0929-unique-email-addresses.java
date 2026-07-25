class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> hs=new HashSet<>();
        for(String email:emails){
            int a=email.indexOf("@");
            int b=email.indexOf("+");
            String s="";
            if(b>=0) s=email.substring(0,b);
            else s=email.substring(0,a);
            s=s.replace(".","")+email.substring(a);
            hs.add(s);
        }
        return hs.size();
    }
}