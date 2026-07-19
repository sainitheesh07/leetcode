
class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder sx=new StringBuilder();
        StringBuilder sy=new StringBuilder();
        StringBuilder o=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c==x) sx.append(c);
            else if(c==y) sy.append(c);
            else o.append(c);
        }
        return sy.toString()+o.toString()+sx.toString();
    }
}