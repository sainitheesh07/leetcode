class Solution {
    public int findMin(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int f=0;
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int t=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=t;
                    f=1;
                }
            }
            if(f==0) break;
        }
        return nums[0];
    }
}