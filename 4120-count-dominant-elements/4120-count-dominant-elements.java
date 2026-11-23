class Solution {
    public int countDominantElements(int[] nums) {
        if(nums.length==1) return 1;
        int c=0;
        c=nums[0]>=nums[1]?c+1:c;
        for(int i=1;i<nums.length-1;i++){
            if(2*nums[i]>=nums[i-1]+nums[i+1]) c++;
        }
        c=nums[nums.length-1]>=nums[nums.length-2]?c+1:c;
        return c;
    }
}