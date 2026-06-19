class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] temp=new Integer [arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp,(a,b)-> {
            int ca=Integer.bitCount(a);
            int cb=Integer.bitCount(b);
            if(ca==cb){
                return Integer.compare(a,b);
            }
            return Integer.compare(ca,cb);
        });
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
        return arr; 
    }
}