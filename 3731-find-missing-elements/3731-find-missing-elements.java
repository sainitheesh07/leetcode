class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> num=new LinkedList<>();
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        boolean[] n=new boolean[101];
        for(int i:nums){
            n[i]=true;
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        for(int i=min;i<=max;i++){
            if(n[i]==false) num.add(i);
        }
        return num;
    }
}