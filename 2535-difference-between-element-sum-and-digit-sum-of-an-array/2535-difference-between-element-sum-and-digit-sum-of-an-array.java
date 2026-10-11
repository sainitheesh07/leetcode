class Solution {
    int digit(int num){
        int t=0;
        while(num>0){
            t+=num%10;
            num/=10;
        }
        return t;
    }
    public int differenceOfSum(int[] nums) {
        int t=0,d=0;
        for(int i:nums) t+=i;
        for(int i:nums){
            if(i<10)d+=i;
            else d+=digit(i);
        }
        return Math.abs(d-t);
    }
}