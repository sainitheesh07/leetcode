class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                c++;
                hp.put(c,i);
            }
        }
        for(int i=0;i<queries.length;i++){
            if(hp.containsKey(queries[i])) queries[i]=hp.get(queries[i]);
            else queries[i]=-1;
        }
        return queries;
    }
}