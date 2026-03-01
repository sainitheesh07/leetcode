class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hp.put(nums[i],hp.getOrDefault(nums[i],0)+1);
        }
        List<Integer> l=new ArrayList<>(hp.keySet());
        Collections.sort(l);
        for(int i=0;i<l.size();i++){
            for(int j=i+1;j<l.size();j++){
                int x=l.get(i);
                int y=l.get(j);
                if(!hp.get(x).equals(hp.get(y))) return new int[]{x,y};
            }
        }
        return new int[]{-1,-1};
    }
}