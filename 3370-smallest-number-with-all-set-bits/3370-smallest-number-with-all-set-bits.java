class Solution {
    public int smallestNumber(int n) {
        String t=Integer.toBinaryString(n);
        int tot=0;
        for(int i=0;i<t.length();i++){
            tot+=Math.pow(2,i);
        }
        return tot;
    }
}