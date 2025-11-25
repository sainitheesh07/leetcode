class Solution {
    public int maxDepth(String s) {
        Stack<Character> t=new Stack<>();
        int a=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(') t.push('(');
            else if(c==')') t.pop();
            a=Math.max(a,t.size());
        }
        return a;
    }
}