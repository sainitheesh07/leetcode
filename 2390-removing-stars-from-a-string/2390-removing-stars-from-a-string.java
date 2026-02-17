class Solution {
    public String removeStars(String s) {
        Stack<Character> p=new Stack<>();
        String r="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='*') p.pop();
            else p.push(c);
        }
        for(char i:p){
            r+=i;
        }
        return r;
    }
}