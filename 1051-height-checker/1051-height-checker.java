class Solution {
    public int heightChecker(int[] heights) {
        int[] arr=Arrays.copyOf(heights,heights.length);
        Arrays.sort(arr);
        int t=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=heights[i]) t++;
        }
        return t;
    }
}