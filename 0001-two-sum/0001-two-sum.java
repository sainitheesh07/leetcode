class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int c=target-nums[i];
            if(hp.containsKey(c)){
                return new int[]{hp.get(c),i};
            }
            hp.put(nums[i],i);
        }
        return new int[]{};
    }
}