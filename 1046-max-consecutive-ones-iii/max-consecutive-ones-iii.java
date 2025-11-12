class Solution {
    public int longestOnes(int[] nums, int k) {
        int s=0,p=0,l=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) p++;
            while(p>k){
                if(nums[l]==0) p--;
                l++;
            }
            s=Math.max(s,i-l+1);
        }
        return s;
    }
}