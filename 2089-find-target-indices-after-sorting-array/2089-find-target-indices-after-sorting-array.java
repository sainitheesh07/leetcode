class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> l=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int t=0;
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int q=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=q;
                    t=1;
                }
            }
            if(t==0) break;
        }
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) l.add(i);
        }
        return l;
    }
}