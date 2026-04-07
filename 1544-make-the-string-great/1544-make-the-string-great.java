class Solution {
    public String makeGood(String s) {
        Stack<Character> p=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!p.isEmpty() && Math.abs(c-p.peek())==32) p.pop();
            else p.push(c);
        }
         StringBuilder result = new StringBuilder();
        while (!p.isEmpty()) {
            result.insert(0, p.pop());
        }
        return result.toString();
    }
}
