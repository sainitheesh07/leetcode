class Solution {
    public int search(int[] nums, int target) {
        int c=-1;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]) c=i;
        }
        return c;
    }
}