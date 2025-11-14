class Solution {
    public int averageValue(int[] nums) {
        int s=0,j=0,k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3==0 && nums[i] %2==0){
                s+=nums[i];
                j++;
            }
            else k++;
        }
        if(k==nums.length) return 0;
        int a=s/j;
        return a;
    }
}