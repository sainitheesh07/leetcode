class Solution {
    public int countSegments(String s) {
        int count=0;
        for(char c:s.toCharArray()){
            if(c==' ') count++;
        }
        return count+1;
    }
}