class Solution {
    public int trap(int[] height) {
        int i=0,j=height.length-1,total=0;
        int lm=height[0],rm=height[j];
        while(i<j){
            if(height[i]<height[j]){
                lm=Math.max(lm,height[i]);
                if(lm-height[i]>0) total+=lm-height[i];
                i++;
            }
            else{
                rm=Math.max(rm,height[j]);
                if(rm-height[j]>0){
                    total+=rm-height[j];
                }
                j--;
            }
        }
        return total;
    }
}