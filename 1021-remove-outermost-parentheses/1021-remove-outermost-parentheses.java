class Solution {
    public String removeOuterParentheses(String s) {
        int l=s.length();
        if(l<=2) return "";
        StringBuilder sb=new StringBuilder();
        int open=1;
        for(int i=1;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                open++;
                if(open>1) sb.append('(');
            }
            else{
                if(open>1) sb.append(')');
                open--;
            }
        }
        return sb.toString();
    }
}