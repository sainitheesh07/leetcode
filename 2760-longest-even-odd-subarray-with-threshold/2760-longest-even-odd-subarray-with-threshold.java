class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int n=nums.length,j=0,i=0,p=0;
        while(i<n){
            if(nums[i]%2==0 && nums[i]<=threshold){
                p=i;
                i++;
                while(i<n && nums[i]<=threshold && nums[i]%2!=nums[i-1]%2){
                    i++;
                }
                j=Math.max(i-p,j);
            }
            else i++;
        }
        return j;
    }
}