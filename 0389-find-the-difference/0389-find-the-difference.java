class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> h1=new HashMap<>();
        HashMap<Character,Integer> h2=new HashMap<>();
        for(char c:s.toCharArray()){
            h1.put(c,h1.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            h2.put(c,h2.getOrDefault(c,0)+1);
        }
        for(char i:h2.keySet()){
            if(!h1.containsKey(i)) return i;
            if(h1.get(i)!=h2.get(i)) return i;
        }
        return ' ';
    }
}