class Solution {
    public int maxProductDifference(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int f=1;
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j+1]<nums[j]){
                    int t=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=t;
                    f=0;
                }
            }
            if(f==1) break;
        }
        System.out.println(Arrays.toString(nums));
        return (nums[nums.length-1]*nums[nums.length-2])-(nums[0]*nums[1]);
    }
}