class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int c=0;
        for(int i:nums){
            if(nums[nums.length/2]==i) c++;
        }
        return c==1;
    }
}