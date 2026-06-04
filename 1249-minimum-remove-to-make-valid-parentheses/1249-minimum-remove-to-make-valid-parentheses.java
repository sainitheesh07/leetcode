class Solution {
    public String minRemoveToMakeValid(String s) {
        HashSet<Integer> hs =new HashSet<>();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(') st.push(i);
            else if(c==')' && !st.isEmpty()){
                st.pop();
            }
            else if(st.isEmpty() && c==')') hs.add(i); 
        }
        while(!st.isEmpty()){
            hs.add(st.pop());
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!hs.contains(i)) sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}