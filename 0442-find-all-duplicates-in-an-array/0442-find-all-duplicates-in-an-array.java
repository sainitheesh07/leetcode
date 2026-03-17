class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hp.put(nums[i],hp.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> l=new ArrayList<>();
        for(Integer i:hp.keySet()){
            if(hp.get(i)!=1) l.add(i);
        }
        return l;
    }
}