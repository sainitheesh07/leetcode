class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return p(nums,goal)-p(nums,goal-1);
    }
    public int p(int[] nums,int goal){
        int l=0,c=0,t=0;
        if(goal<0) return 0;
        for(int i=0;i<nums.length;i++){
            t+=nums[i];
            while(t>goal){
                t-=nums[l];
                l++;
            }
            c+=(i-l+1);
        }
        return c;
    }
}