class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int i=0;
        for(int n:nums){
            if(i<k || nums[i-k]!=n){
                nums[i++]=n;
            }
        }
        int[] ans=new int[i];
        for(int j=0;j<i;j++){
            ans[j]=nums[j];
        }
        return ans;
    }
}