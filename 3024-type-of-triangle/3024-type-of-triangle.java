class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> hs=new HashSet<>();
        hs.add(nums[0]);
        hs.add(nums[1]);
        hs.add(nums[2]);
        if(nums[0]+nums[1]<=nums[2]) return "none";
        if(hs.size()==1) return "equilateral";
        else if(hs.size()==2) return "isosceles";
        return "scalene";
    }
}