class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        k%=(m*n);
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer> r=new ArrayList<>();
            for(int j=0;j<n;j++){
                r.add(grid[i][j]);
            }
            l.add(r);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int oi=(i*n)+j;
                int ni=(oi+k)%(m*n);
                int nr=ni/n;
                int nc=ni%n;
                l.get(nr).set(nc,grid[i][j]);
            }
        }
        return l;
    }
}