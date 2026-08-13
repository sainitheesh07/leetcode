class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] arr=new int [matrix.length];
        for(int i=0;i<matrix.length;i++){
            int n=0;
            for(int j:matrix[i]){
                n+=j;
            }
            arr[i]=n;
        }
        return arr;
    }
}