class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,temp=0,n=nums.length,ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            temp+=nums[i];
            while(temp>=target){
                ans=Math.min(ans,i-l+1);
                temp-=nums[l];
                l++;
            }
        }
        if(ans==Integer.MAX_VALUE) return 0;
        return ans;
    }
}