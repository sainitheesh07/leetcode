class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long t=0;
        int i=nums.length-1;
        while(k>0){
            if(mul>0) t+=(long)nums[i]*mul;
            else t+=(long)nums[i];
            k--;
            mul--;
            i--;
        }
        return t;
    }
}