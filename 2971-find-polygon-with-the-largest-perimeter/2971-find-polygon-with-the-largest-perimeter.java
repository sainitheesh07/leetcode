class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long s=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            s-=nums[i];
            if(s>nums[i]) return s+nums[i];
        }
        return -1;
    }
}