class Solution {
    public int sum(int n){
        int total=0;
        while(n>0){
            int r=n%10;
            total+=r;
            n/=10;
        }
        return total;
    }
    public int minElement(int[] nums) {
        int ans=Integer.MAX_VALUE;
        for(int i:nums){
            ans=Math.min(sum(i),ans);
        }
        return ans;
    }
}