class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> l=new ArrayList<>();
        HashMap<Integer,List<Integer>> h=new HashMap<>();
        for(int i=0;i<groupSizes.length;i++){
            int s=groupSizes[i];
            if(!h.containsKey(s)) h.put(s,new ArrayList<>());
            h.get(s).add(i);
            if(h.get(s).size()==s){
                l.add(new ArrayList<>(h.get(s)));
                h.get(s).clear();
            }
        }
        return l;
    }
}