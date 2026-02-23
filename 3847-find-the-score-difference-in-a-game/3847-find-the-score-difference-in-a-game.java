class Solution {
    public int scoreDifference(int[] nums) {
        int a=0,b=0;
        boolean f=true;
        for(int i=0;i<nums.length;i++){
            int p=nums[i];
            if(p%2==1) f=!f;
            if(i%6==5) f=!f;
            if(f) a+=p;
            else b+=p;
        }
        return a-b;
    }
}