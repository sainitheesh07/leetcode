class Solution {
    public int minimumCost(int[] nums) {
        for(int i=1;i<nums.length;i++){
            int f=0;
            for(int j=1;j<nums.length-1;j++){
                if(nums[j] >nums[j+1]){
                    int t=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=t;
                    f=1;
                }
            }
            if(f==0) break;
        }
        System.out.println(Arrays.toString(nums));
        return nums[0]+nums[1]+nums[2];
    }
}