class Solution {
    int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public long maxPairStrength(int[] nums) {
        long m=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long mult=(long)nums[i]*(long)nums[j];
                long g=(long)Math.pow(gcd(nums[i],nums[j]),2);
                m=Math.max(m,(long)mult/g);
            }
        }
        return m;
    }
}