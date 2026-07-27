class Solution {
    public int countWords(String[] words1, String[] words2) {
        int c=0;
        HashMap<String,Integer> h1=new HashMap<>();
        HashMap<String,Integer> h2=new HashMap<>();
        for(String i:words1){
            h1.put(i,h1.getOrDefault(i,0)+1);
        }
        for(String i:words2){
            h2.put(i,h2.getOrDefault(i,0)+1);
        }
        for(String i:h1.keySet()){
            if(h1.get(i)==1 && h2.getOrDefault(i,0)==1) c++;
        }
        return c;
    }
}