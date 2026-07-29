class Solution {
    public int sumOfUnique(int[] nums) {
        int[] arr=new int[101];
        for(int i:nums){
            arr[i]++;
        }
        int t=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1) t+=i;
        }
        return t;
    }
}