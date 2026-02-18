class Solution {
    String bit(int n){
        StringBuilder s=new StringBuilder();
        while(n>0){
            if(n%2==0) s.append('0');
            else s.append('1');
            n/=2;
        }
        return s.toString();
    }
    public boolean hasAlternatingBits(int n) {
        String p=bit(n);
        for(int i=0;i<p.length()-1;i++){
            char c=p.charAt(i);
            char ch=p.charAt(i+1);
            if(c==ch) return false;
        }
        return true;
    }
}