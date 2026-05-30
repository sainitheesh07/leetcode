class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr=new int [2];
        int s=0,c=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(hs.contains(grid[i][j])) c=grid[i][j];
                else s+=grid[i][j];
                hs.add(grid[i][j]);
            }
        }
        int b=grid[0].length;
        int n=b*b;
        int a=(n*(n+1))/2;
        arr[1]=a-s;
        arr[0]=c;
        return arr;
    }
}