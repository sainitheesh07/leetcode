class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> hp=new HashMap<>();
        hp.put(']','[');
        hp.put('}','{');
        hp.put(')','(');
        Stack<Character> t=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!hp.containsKey(c)) t.push(c);
            else{
                if(t.empty()) return false;
                char top=t.pop();
                if(top!=hp.get(c)) return false;
            }
        }
        return t.isEmpty();
    }
}