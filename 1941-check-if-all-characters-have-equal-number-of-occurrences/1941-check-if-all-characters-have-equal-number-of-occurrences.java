class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> hp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            hp.put(c,hp.getOrDefault(c,0)+1);
        }
        HashSet<Integer> hs=new HashSet<>();
        for(Integer i:hp.values()){
            hs.add(i);
        }
        return hs.size()==1;
    }
}