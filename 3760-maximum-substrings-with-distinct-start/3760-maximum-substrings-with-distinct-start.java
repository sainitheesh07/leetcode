class Solution {
    public int maxDistinct(String s) {
        HashMap<Character,Integer> hp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            hp.put(c,hp.getOrDefault(c,0)+1);
        }
        return hp.size();
    }
}