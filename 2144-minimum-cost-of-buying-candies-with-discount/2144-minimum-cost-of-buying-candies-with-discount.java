class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int s=0,k=0;
        for(int i=cost.length-1;i>=0;i--){
            if(k==2) k=0;
            else{
                s+=cost[i];
                k++;
            }
        }
        return s;
    }
}