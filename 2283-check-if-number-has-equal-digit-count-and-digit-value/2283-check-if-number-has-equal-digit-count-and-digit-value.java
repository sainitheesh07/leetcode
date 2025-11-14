class Solution {
    public boolean digitCount(String num) {
        HashMap<Integer,Integer> hp = new HashMap<>();
        int t=0;
        for(int i=0;i<num.length();i++){
            char c=num.charAt(i);
            int a=c-'0';
            if(!hp.containsKey(a)) hp.put(a,1);
            else hp.put(a,hp.get(a)+1);
        }
        for(int i=0;i<num.length();i++){
            int a=num.charAt(i)-'0';
            if(hp.getOrDefault(i,0)!=a) return false;
        }
        return true;
    }
}