class Solution {
    public int compareBitonicSums(int[] nums) {
        int i=0;
        long s=0,t=0;
        while(nums[i]<nums[i+1]){
            s+=nums[i];
            i++;
        }
        s+=nums[i];
        while(i<nums.length){
            t+=nums[i];
            i++;
        }
        System.out.println(s+" "+t);
        if(s==t) return -1;
        if(s<t) return 1;
        else return 0;
    }
}