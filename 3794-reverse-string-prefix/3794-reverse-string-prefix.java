class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder t=new StringBuilder();
        StringBuilder p=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(i<k) t.append(c);
            else p.append(c); 
        }
        return t.reverse().append(p).toString();
    }
}