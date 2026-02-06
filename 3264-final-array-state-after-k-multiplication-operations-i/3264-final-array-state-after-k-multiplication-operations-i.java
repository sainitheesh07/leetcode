class Solution {
    int minma(int[] nums){
        int ci=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[ci]){
                ci=i;
            }
        }
        return ci;
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int a=0,c=Integer.MAX_VALUE,n=nums.length;
        for(int i=0;i<k;i++){
            a=minma(nums);
            nums[a]=nums[a]*multiplier;
        }
        return nums;
    }
}