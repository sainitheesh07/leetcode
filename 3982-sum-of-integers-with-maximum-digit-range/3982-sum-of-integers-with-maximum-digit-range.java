class Solution {
    public int range(int num){
        int i=Integer.MAX_VALUE,j=Integer.MIN_VALUE;
        while(num>0){
            i=Math.min(i,num%10);
            j=Math.max(j,num%10);
            num/=10;
        }
        return j-i;
    }
    public int maxDigitRange(int[] nums) {
        int m=Integer.MIN_VALUE;
        for(int i:nums){
            m=Math.max(m,range(i));
        }
        int t=0;
        for(int i:nums){
            if(m==range(i)) t+=i;
        }
        return t;
    }
}