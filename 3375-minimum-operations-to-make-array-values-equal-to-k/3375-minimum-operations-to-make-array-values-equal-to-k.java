class Solution {
    public int minOperations(int[] nums, int k) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k) return -1;
            else if(nums[i]>k) hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        return hs.size();
    }
}