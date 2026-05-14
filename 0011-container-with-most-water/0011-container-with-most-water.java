class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,m=Integer.MIN_VALUE;
        while(i<j){
            int b=j-i;
            int l=Math.min(height[i],height[j]);
            int a=l*b;
            m=Math.max(a,m);
            if(height[i]>height[j]) j--;
            else i++;
        }
        return m;
    }
}