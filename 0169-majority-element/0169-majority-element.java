class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hp =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            hp.put(n,hp.getOrDefault(n,0)+1);
        }
        int a=nums.length/2;
        for(int i:hp.keySet()){
            int b=hp.get(i);
            if(a<b){
                a=i;
                break;
            }
        }
        return a;
    }
}