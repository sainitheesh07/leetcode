class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int m=Integer.MAX_VALUE;
            for(int j=0;j<matrix[i].length;j++){
                m=Math.min(m,matrix[i][j]);
            }
            l1.add(m);
        }
        for(int i=0;i<matrix[0].length;i++){
            int t=Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++){
                t=Math.max(t,matrix[j][i]);
            }
            l2.add(t);
        }
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==l1.get(i) && matrix[i][j]==l2.get(j)) l.add(matrix[i][j]);
            }
        }
        return l;
    }
}