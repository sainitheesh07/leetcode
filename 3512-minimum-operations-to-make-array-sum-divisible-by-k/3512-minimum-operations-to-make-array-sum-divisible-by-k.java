class Solution {
    public int minOperations(int[] nums, int k) {
        int t=0;
        for(int i:nums){
            t+=i;
        }
        return t%k;
    }
}