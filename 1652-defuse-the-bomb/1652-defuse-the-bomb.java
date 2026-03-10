class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            if(k>0){
                for(int j=i+1;j<i+k+1;j++){
                    arr[i]+=code[j%n];
                }
            }
            else{
                for(int j=i-1;j>i-1-Math.abs(k);j--){
                    arr[i]+=code[((j%n)+n)%n];
                }
            }
        }
        return arr;
    }
}