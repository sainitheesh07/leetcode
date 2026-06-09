class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long s=0,m=Integer.MAX_VALUE;
        for(int i:nums){
            s=Math.max(s,i);
            m=Math.min(m,i);
        }
        return (s-m)*k;
    }
}