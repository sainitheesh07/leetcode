class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int c=0;
        for(int i=0;i<patterns.length;i++){
            String p=patterns[i];
            if(word.contains(p)) c++;
        }
        return c;
    }
}