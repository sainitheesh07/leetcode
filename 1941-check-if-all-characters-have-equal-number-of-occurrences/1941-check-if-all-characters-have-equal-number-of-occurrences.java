class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> hp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            hp.put(c,hp.getOrDefault(c,0)+1);
        }
        int v=0;
        for(Integer i:hp.values()){
            if(v==0) v=i;
            else if(v!=i) return false;
        }
        return true;
    }
}