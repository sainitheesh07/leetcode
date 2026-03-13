class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int m=Integer.MAX_VALUE,t=-1;
        for(int i=0;i<capacity.length;i++){
            if(capacity[i]>=itemSize && capacity[i]<m){
                m=capacity[i];
                t=i;
            }
        }
        return t;
    }
}