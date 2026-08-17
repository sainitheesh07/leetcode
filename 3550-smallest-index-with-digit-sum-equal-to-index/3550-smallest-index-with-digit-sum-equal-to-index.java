class Solution {
    int count(int n){
        int t=0;
        while(n>0){
            t+=(n%10);
            n/=10;
        }
        return t;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10 && i==nums[i]) return i;
            else if(count(nums[i]) ==i) return i;
        }
        return -1;
    }
}