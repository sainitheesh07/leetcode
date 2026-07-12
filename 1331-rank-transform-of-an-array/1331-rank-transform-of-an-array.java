class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] r=Arrays.copyOf(arr,arr.length);
        Arrays.sort(r);
        HashMap<Integer,Integer> hp=new HashMap<>();
        int k=1;
        for(int i:r){
            if(!hp.containsKey(i)){
                hp.put(i,k);
                k++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(hp.containsKey(arr[i])) r[i]=hp.get(arr[i]);
        }
        return r;
    }
}