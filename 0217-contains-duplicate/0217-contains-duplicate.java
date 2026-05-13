class Solution {
    public boolean containsDuplicate(int[] nums) {
        int dup=0;
        HashSet<Integer> hp=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!hp.contains(nums[i])) hp.add(nums[i]);
            else dup=1;
        }
        return dup==1;
    }
}