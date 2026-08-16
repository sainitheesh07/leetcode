class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int ct=0,tt=0;
        for(int i:requests){
            tt+=Math.abs(i-ct);
            ct=i;
        }
        return tt;
    }
}