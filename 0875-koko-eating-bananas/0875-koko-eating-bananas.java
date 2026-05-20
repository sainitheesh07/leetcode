class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i=1,j=1;
        for(int pile:piles){
            j=Math.max(j,pile);
        }
        while(i<j){
            int mid=i+(j-i)/2;
            if(eat(piles,mid,h)) j=mid;
            else i=mid+1;
        }
        return i;
    }
    private boolean eat(int[] piles,int mid,int h){
        int hours=0;
        for(int pile:piles){
            hours+=Math.ceil((double)pile/mid);
        }
        return hours<=h;
    }
}