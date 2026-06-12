class Solution {
    public int minPartitions(String n) {
        int i=Integer.MIN_VALUE;
        for(char c:n.toCharArray()){
            i=Math.max(i,c-'0');
        }
        return i;
    }
}