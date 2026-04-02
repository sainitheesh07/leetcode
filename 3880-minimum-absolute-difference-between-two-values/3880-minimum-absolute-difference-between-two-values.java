class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int c=-1,m=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==1 && nums[j]==2){
                    c=Math.abs(i-j);
                    m=Math.min(c,m);
                }
            }
        }
        if(m==Integer.MAX_VALUE) m=-1;
        return m;
    }
}