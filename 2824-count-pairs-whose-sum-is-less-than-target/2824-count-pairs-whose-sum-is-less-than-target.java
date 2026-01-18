class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int[] arr=new int [nums.size()];
        int k=0,c=0;
        for(int i:nums){
            arr[k++]=i;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]+arr[j]<target && i!=j) c++;
            }
        }
        //System.out.println(Arrays.toString(arr));
        return c;
    }
}