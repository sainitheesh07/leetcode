class Solution {
    public String count(String t){
        int s=0;
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            s+=c-'0';
        }
        return Integer.toString(s);
    }
    public int getLucky(String s, int k) {
        String t="";
        String p="";
        for(char c:s.toCharArray()){
            t+=((c-'a'+1)+"");
        }
        while(k-->0){
            p=count(t);
            t=p;
        }
        System.out.println(t);
        return Integer.parseInt(t);
    }
}