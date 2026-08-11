class Solution {
    public int countPartitions(int[] nums) {
        int sum=0,a=0,c=0;;
        for(int i:nums) sum+=i;
        for(int i=0;i<nums.length-1;i++){
            sum-=nums[i];
            a+=nums[i];
            if((a-sum)%2==0){
                //System.out.println(a+" "+sum+" "+c);
                c++;
            }
        }
        return c;
    }
}