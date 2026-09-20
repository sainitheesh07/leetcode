class Solution {
    public int maxPower(String s) {
        int max=1,streak=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i)){
                streak++;
                max=Math.max(max,streak);
                continue;
            }
            streak=1;
        }
        return max;
    }
}