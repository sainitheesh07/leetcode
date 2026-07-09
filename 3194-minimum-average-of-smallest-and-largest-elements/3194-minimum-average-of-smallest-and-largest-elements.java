class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1,min=Integer.MAX_VALUE;
        while(i<j){
            int avg=nums[i]+nums[j];
            if(avg<min) min=avg;
            i++;
            j--;
        }
        return (double)min/2;
    }
}