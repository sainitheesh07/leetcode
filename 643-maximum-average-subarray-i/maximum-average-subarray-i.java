class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int s=0,l=0;
        if(n==1) return (double)nums[0];
        for(int i=0;i<k;i++){
            s+=nums[i];
        }
        double p =s;
        for(int i=k;i<n;i++){
            s=s+nums[i]-nums[i-k];
            p=Math.max(p,s);
        }
        return p/k;
    }
}