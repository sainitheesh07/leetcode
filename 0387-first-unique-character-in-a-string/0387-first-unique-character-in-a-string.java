class Solution {
    public int firstUniqChar(String s) {
        int n=-1;
        HashMap<Character,Integer> p=new HashMap<>();
        for(char c:s.toCharArray()){
            p.put(c,p.getOrDefault(c,0)+1);
        }
        System.out.println(p);
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(p.get(c)==1){
                n=i;
                break;
            }
        }
        return n;
    }
}