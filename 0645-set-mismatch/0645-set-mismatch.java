class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> hp=new HashSet<>();
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(!hp.contains(nums[i])) hp.add(nums[i]);
            else c=nums[i];
        }
        int s=0;
        int n=nums.length;
        int a=n*(n+1)/2;
        for(int i:hp){
            s+=i;
        }
        int[] arr=new int[2];
        arr[0]=c;
        arr[1]=a-s;
        return arr;
    }
}