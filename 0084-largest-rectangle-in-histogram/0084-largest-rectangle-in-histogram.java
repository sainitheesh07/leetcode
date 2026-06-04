class Solution {
    public int largestRectangleArea(int[] heights) {
        int m=0,n=heights.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=n;i++){
            int curr=(i==n)?0:heights[i];
            while(!st.isEmpty() && curr<heights[st.peek()]){
                int height=heights[st.pop()];
                int width=st.isEmpty()?i:i-st.peek()-1;
                m=Math.max(m,height*width);
            }
            st.push(i);
        }
        return m;
    }
}