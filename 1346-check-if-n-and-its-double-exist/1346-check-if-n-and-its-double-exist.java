class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> hp=new HashSet<>();
        for(int i:arr){
            if(hp.contains(i*2) || (i%2==0 && hp.contains(i/2))) return true;
            hp.add(i);
        }
        return false;
    }
}