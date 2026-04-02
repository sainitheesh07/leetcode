class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hp=new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            hp.add(candyType[i]);
        }
        int n=candyType.length/2;
        if(hp.size()>n) return n;
        return hp.size();
    }
}