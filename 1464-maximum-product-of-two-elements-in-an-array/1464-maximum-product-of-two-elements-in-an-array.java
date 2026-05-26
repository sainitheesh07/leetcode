class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length,m=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    int p=(nums[i]-1)*(nums[j]-1);
                    m=Math.max(m,p);
                }
            }
        }
        return m;
    }
}