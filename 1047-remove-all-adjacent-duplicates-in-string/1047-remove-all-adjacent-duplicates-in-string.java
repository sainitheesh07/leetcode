class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> t=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!t.isEmpty() && t.peek()==c) t.pop();
            else t.push(c);
        }
        System.out.println(t);
        String r="";
        for(char i:t){
            r+=i;
        }
        return r;
    }
}