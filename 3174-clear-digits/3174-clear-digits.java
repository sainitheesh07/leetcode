class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            st.push(c);
            if(Character.isDigit(c)){
                st.pop();
                st.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        for(Character c:st){
            sb.append(c);
        }
        return sb.toString();
    }
}