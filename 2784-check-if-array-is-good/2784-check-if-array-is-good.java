class Solution {
    public boolean isGood(int[] nums) {
        int m=Integer.MIN_VALUE;
        for(int i:nums){
            m=Math.max(i,m);
        }
        if(m+1!=nums.length) return false;
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hp.put(nums[i],hp.getOrDefault(nums[i],0)+1);
        }
        for(Integer i:hp.keySet()){
            if(i!=m && hp.get(i)!=1) return false;
        }
        return hp.get(m)==2;
    }
}