class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int r=2,c=0;
        for(int i=0;i<piles.length/3;i++){
            c+=piles[piles.length-r];
            r+=2;
        }
        return c;
    }
}