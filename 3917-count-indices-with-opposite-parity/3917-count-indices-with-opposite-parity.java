class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n=nums.length,odd=0,even=0;
        int[] res=new int [n];
        for(int i=n-1;i>=0;i--){
            if(nums[i]%2!=0){
                res[i]=even;
                odd++;
            }
            else{
                res[i]=odd;
                even++;
            }
        }
        return res;
    }
}