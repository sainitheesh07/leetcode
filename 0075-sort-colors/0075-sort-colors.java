class Solution {
    public void swap(int[] nums,int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public void sortColors(int[] nums) {
        int i=0,l=0,h=nums.length-1;
        while(i<=h){
            if(nums[i]==0){
                swap(nums,i,l);
                l++;
                i++;
            }
            else if(nums[i]==2){
                swap(nums,i,h);
                h--;
            }
            else i++;
        }
    }
}