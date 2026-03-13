class Solution {
    public int maximumWealth(int[][] accounts) {
        int m=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int s=0;
            for(int j=0;j<accounts[i].length;j++){
                s+=accounts[i][j];
            }
            m=Math.max(m,s);
        }
        return m;
    }
}